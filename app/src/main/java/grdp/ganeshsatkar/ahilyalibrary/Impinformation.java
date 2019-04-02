package grdp.ganeshsatkar.ahilyalibrary;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class Impinformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_impinformation);


        CardView c = (CardView) findViewById(R.id.satbara);
        CardView c1 = findViewById(R.id.voterid);
        CardView c2 = findViewById(R.id.Aadhar);
        CardView c3 = findViewById(R.id.grampanchayat);



        c.setOnClickListener(new View.OnClickListener() {

                                 @Override
                                 public void onClick(View v) {

                                     Intent i = sakal(Impinformation.this);
                                     startActivity(i);


                                 }


                             }


        );

        c1.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = lokmat(Impinformation.this);
                                      startActivity(intent);


                                  }


                              }
        );

        c2.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = mata(Impinformation.this);
                                      startActivity(intent);


                                  }


                              }
        );


        c3.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {

                                      Intent intent = loksatta(Impinformation.this);
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
                    Uri.parse("https://www.mpsc.gov.in/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.mpsc.gov.in/"));
        }


    }

    public static Intent lokmat(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.upsc.gov.in/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.upsc.gov.in/"));
        }


    }


    public static Intent mata(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://eaadhaar.uidai.gov.in/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://eaadhaar.uidai.gov.in/"));
        }


    }

    public static Intent loksatta(Context context) {

        try {
            context.getPackageManager()
                    .getPackageInfo("com.android.chrome", 0);
            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://ssc.nic.in/"));

        } catch (Exception e) {

            return new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://ssc.nic.in/"));
        }


    }




}

