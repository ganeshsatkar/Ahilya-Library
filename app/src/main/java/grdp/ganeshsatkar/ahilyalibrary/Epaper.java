package grdp.ganeshsatkar.ahilyalibrary;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Epaper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epaper);


        CardView c = (CardView) findViewById(R.id.sakal);
        CardView c1 = findViewById(R.id.lokmat);
        CardView c2 = findViewById(R.id.mata);
        CardView c3 = findViewById(R.id.loksatta);
        CardView c4 = findViewById(R.id.pudhari);
        CardView c5 = findViewById(R.id.punyanagari);
        CardView c6 = findViewById(R.id.samna);
        CardView c7 = findViewById(R.id.prahar);
        CardView c8 = findViewById(R.id.divyamarathi);
        CardView c9 = findViewById(R.id.tarunbharat);


        c.setOnClickListener(new View.OnClickListener() {

                                 @Override
                                 public void onClick(View v) {

                                     Intent i = sakal(Epaper.this);
                                     startActivity(i);


                                 }


                             }


        );

        c1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = lokmat(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );

        c2.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = mata(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c3.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = loksatta(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c4.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = pudhari(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );

        c5.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = punyanagari(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );

        c6.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = saamana(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c7.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = prahar(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c8.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = divyamarathi(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c9.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = tarunbharat(Epaper.this);
                                      startActivity(intent);


                                  }


                              }
        );

    }


    public static Intent sakal(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.esakal.com/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.esakal.com/   "));
        }


    }

    public static Intent lokmat(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.lokmat.com/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.lokmat.com/"));
        }


    }


    public static Intent mata(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://maharashtratimes.indiatimes.com/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://maharashtratimes.indiatimes.com/"));
        }


    }

    public static Intent loksatta(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.loksatta.com/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.loksatta.com/"));
        }


    }


    public static Intent pudhari(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.pudhari.news/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.pudhari.news/"));
        }


    }


    public static Intent punyanagari(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.epunyanagari.com/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.epunyanagari.com/"));
        }


    }


    public static Intent saamana(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.saamana.com/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.saamana.com/"));
        }


    }

    public static Intent prahar(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://epaper.eprahaar.in/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://epaper.eprahaar.in/"));
        }


    }

    public static Intent divyamarathi(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://divyamarathi.bhaskar.com/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://divyamarathi.bhaskar.com/"));
        }


    }

    public static Intent tarunbharat(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://epaper.tarunbharat.com/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://epaper.tarunbharat.com/"));
        }


    }
    }
