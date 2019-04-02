package grdp.ganeshsatkar.ahilyalibrary;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import static android.content.Intent.ACTION_DIAL;
import static android.content.Intent.ACTION_SEND;
import static android.content.Intent.EXTRA_EMAIL;
import static android.content.Intent.EXTRA_SUBJECT;
import static android.content.Intent.EXTRA_TEXT;
import static android.content.Intent.createChooser;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private boolean exit = false;
    private WebView webView;

    AdView adView;
    private InterstitialAd interstitialAd;

    private long backPressedTime;




    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {








        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.menuitom:

                    Intent i = new Intent(MainActivity.this, Request.class);
                    startActivity(i);
                    return true;



                case R.id.whatsapp:


                    Intent intent1 = new Intent(MainActivity.this, Feestructure.class);
                    startActivity(intent1);
                    return true;



                  /*  startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse(
                                    "https://api.whatsapp.com/send?phone=+918483035820&text=Welcome%20to%20Janjira%20Seafood%20resto%20Write%20your%20Message%20here"
                            )));
                    return true;*/







                case R.id.call:
                    String phone = "+918483035820";
                    Intent intent = new Intent(ACTION_DIAL, Uri.fromParts("tel", phone, null));
                    startActivity(intent);
                    return true;
            }
            return false;
        }
    };








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);





        Button b = findViewById(R.id.home);
        Button b3 = findViewById(R.id.message);
        Button b4 = findViewById(R.id.upkram);
        Button b2 = findViewById(R.id.suvidha);
        Button gal = findViewById(R.id.gallery);
        Button b5 = findViewById(R.id.contact);
        Button b6 = findViewById(R.id.epaper);
        Button b7 = findViewById(R.id.impinformation);
        Button b8 = findViewById(R.id.gunvant);






        b.setOnClickListener(new View.OnClickListener() {

                                 public void onClick(View v) {

                                     Intent intent = new Intent(MainActivity.this, Home.class);

                                     startActivity(intent);
                                 }

                             }
        );


        b2.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Suvidha.class);

                                      startActivity(intent);
                                  }

                              }
        );

        b3.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Message.class);

                                      startActivity(intent);
                                  }

                              }
        );






        b4.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Upkram.class);

                                      startActivity(intent);
                                  }

                              }
        );

        b5.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Contact.class);

                                      startActivity(intent);
                                  }

                              }
        );


        b6.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Epaper.class);

                                      startActivity(intent);
                                  }

                              }
        );

        b7.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Impinformation.class);

                                      startActivity(intent);
                                  }

                              }
        );

        b8.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, Gunvant.class);

                                      startActivity(intent);
                                  }

                              }
        );



       /* call.setOnClickListener(new View.OnClickListener() {

                                  public void onClick(View v) {

                                      Intent intent = new Intent(MainActivity.this, call.class);

                                      startActivity(intent);
                                  }

                              }
        );
*/



         gal.setOnClickListener(new View.OnClickListener() {

                                          public void onClick(View v) {

                                              Intent intent = new Intent(MainActivity.this, ViewPagerExampleActivity.class);

                                              startActivity(intent);
                                          }

                                      }
        );












        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        adView = (AdView) findViewById(R.id.adView);

        //webView.onPause();
        // webView.pauseTimers();
        AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
        adView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId("ca-app-pub-7233052509464359/4126021460");
        interstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // startActivity(new Intent(MainActivity.this,Designby.class));
                finish();
                interstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
            }
        });



    }









    @Override
    public void onBackPressed() {


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            //super.onBackPressed();


            if (backPressedTime + 2000 > System.currentTimeMillis()) {

                super.onBackPressed();
                return;

            } else {
                Toast.makeText(getBaseContext(), "Tap Back button again to exit", Toast.LENGTH_SHORT).show();


            }

            backPressedTime = System.currentTimeMillis();

        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.mail) {

            Intent intent = new Intent(ACTION_SEND);
            intent.setType("plain/text");
            intent.putExtra(EXTRA_EMAIL, new String[]{"asmplibrary@gmail.com"});
            intent.putExtra(EXTRA_SUBJECT, "subject");
            intent.putExtra(EXTRA_TEXT, "mail body");
            startActivity(createChooser(intent, ""));

        }

        if (id == R.id.call) {

            String phone = "+91 8483035820";
            Intent intent = new Intent(ACTION_DIAL, Uri.fromParts("tel", phone, null));
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            startActivity(new Intent(MainActivity.this,Home.class));

        }



        // startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Ganeshsatkar")));

            // Handle the camera action










         else if (id == R.id.webite1) {
            Uri uri = Uri.parse("http://www.ahilyalibrary.wordpress.com");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.android.chrome");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.ahilyalibrary.wordpress.com")));
            }



        } else if (id == R.id.map) {

            Uri uri = Uri.parse("https://goo.gl/maps/jqyhX9PUwco");
            Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

            likeIng.setPackage("com.google.android.apps.maps");

            try {
                startActivity(likeIng);
            } catch (ActivityNotFoundException e) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://goo.gl/maps/jqyhX9PUwco")));
            }




        } else if (id == R.id.nav_share) {



            Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBodyText = getString(R.string.sharestring);
            sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,"Subject here");
            sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(sharingIntent, "Shearing Option"));
            return true;




        } else if (id == R.id.designby) {

            startActivity(new Intent(MainActivity.this,Designby.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
