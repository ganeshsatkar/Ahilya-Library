package grdp.ganeshsatkar.ahilyalibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Request extends AppCompatActivity {
    Button b, b2;

    EditText e1, e2, e3,  e5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);


        b = (Button) findViewById(R.id.viamail);
        b2 = findViewById(R.id.viawhatsapp);
        e1 = (EditText) findViewById(R.id.editTextname);
        e2 = (EditText) findViewById(R.id.editTextphone);
        e3 = (EditText) findViewById(R.id.editTextemail);
        //  e4=(EditText)findViewById(R.id.editTextaddress);
        e5 = (EditText) findViewById(R.id.editTextmsg);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"asmplibrary@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Your Feedback");
                i.putExtra(Intent.EXTRA_TEXT, "Name : " + e1.getText() + "\n\nPhone : " + e2.getText() + "\n\nEmail : " + e3.getText() + "\n\nMessage : " + e5.getText());
                try {
                    startActivity(Intent.createChooser(i, "Send feedback..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String toNumber = "+918483035820"; // contains spaces.
                toNumber = toNumber.replace("+", "").replace(" ", "");

                Intent sendIntent = new Intent("android.intent.action.MAIN");
                sendIntent.putExtra("jid", toNumber + "@s.whatsapp.net");
                sendIntent.putExtra(Intent.EXTRA_TEXT, "Name : " + e1.getText() + "\n\nPhone : " + e2.getText() + "\n\nEmail : " + e3.getText() + "\n\nMessage : " + e5.getText());
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setPackage("com.whatsapp");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

    }
}