package grdp.ganeshsatkar.ahilyalibrary;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Select_language_page extends AppCompatActivity {

    TextView mTextView;
    Spinner mLanguage;
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_language_page);

        Button b = (Button) findViewById(R.id.nextpage);

        b.setOnClickListener(new View.OnClickListener() {

                                 public void onClick(View v) {

                                     Intent intent = new Intent(Select_language_page.this, MainActivity.class);

                                     startActivity(intent);
                                 }

                             }
        );


        mLanguage = (Spinner) findViewById(R.id.spLanguage);
        mTextView = (TextView) findViewById(R.id.textView);
        mAdapter = new ArrayAdapter<String>(Select_language_page.this, android.R.layout.simple_spinner_dropdown_item, getResources().getStringArray(R.array.language_option));
        mLanguage.setAdapter(mAdapter);

        if (LocaleHelper.getLanguage(Select_language_page.this).equalsIgnoreCase("en")) {
            mLanguage.setSelection(mAdapter.getPosition("English"));
        } else if (LocaleHelper.getLanguage(Select_language_page.this).equalsIgnoreCase("mr")) {
            mLanguage.setSelection(mAdapter.getPosition("Marathi"));
        }

        mLanguage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Context context;
                Resources resources;
                switch (i) {
                    case 0:
                        context = LocaleHelper.setLocale(Select_language_page.this, "en");
                        resources = context.getResources();
                        mTextView.setText(resources.getString(R.string.text_translation));
                        break;
                    case 1:
                        context = LocaleHelper.setLocale(Select_language_page.this, "mr");
                        resources = context.getResources();
                        mTextView.setText(resources.getString(R.string.text_translation));
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocaleHelper.onAttach(newBase));
    }
}
