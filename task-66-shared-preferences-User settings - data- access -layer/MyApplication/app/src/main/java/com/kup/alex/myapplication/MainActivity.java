package com.kup.alex.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText eT;
    EditText eT2;
    EditText eT3;
    EditText eT4;
    EditText eT5;
    EditText city;
    EditText street;
    EditText hnum;
    EditText zip;
    TextView tV;
    TextView tV2;
    TextView tV3;
    TextView tV4;
    TextView tV5;
    Button btnS;
    Button btnL;

    SharedPreferences sPref;


    final String SAVED_TEXT = "saved_text";
    final String SAVED_TEXT2 = "saved_text2";
    final String SAVED_TEXT3 = "saved_text3";
    final String SAVED_TEXT4 = "saved_text4";
    final String SAVED_TEXT5 = "saved_text5";
    final String SAVED_TEXT6 = "saved_text6";
    final String SAVED_TEXT7 = "saved_text7";
    final String SAVED_TEXT8 = "saved_text8";
    final String SAVED_TEXT9 = "saved_text9";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT = (EditText)findViewById(R.id.eT);
        eT2 = (EditText)findViewById(R.id.eT2);
        eT3 = (EditText)findViewById(R.id.eT3);
        eT4 = (EditText)findViewById(R.id.eT4);
        eT5 = (EditText)findViewById(R.id.eT5);
        city = (EditText)findViewById(R.id.city);
        street = (EditText)findViewById(R.id.street);
        hnum = (EditText)findViewById(R.id.hnum);
        zip = (EditText)findViewById(R.id.zip);
        tV = (TextView)findViewById(R.id.tV);
        tV2 = (TextView)findViewById(R.id.tV2);
        tV3 = (TextView)findViewById(R.id.tV3);
        tV4 = (TextView)findViewById(R.id.tV4);
        tV5 = (TextView)findViewById(R.id.tV5);
        btnS = (Button)findViewById(R.id.btnS);
        btnS.setOnClickListener(this);
        btnL = (Button)findViewById(R.id.btnL);
        btnL.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnS:
                saveText();


                break;
            case R.id.btnL:
                loadText();


                break;
        }

    }





    private void saveText() {
        sPref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(SAVED_TEXT, eT.getText().toString());
        ed.putString(SAVED_TEXT2, eT2.getText().toString());
        ed.putString(SAVED_TEXT3, eT3.getText().toString());
        ed.putString(SAVED_TEXT4, eT4.getText().toString());
        ed.putString(SAVED_TEXT5, eT5.getText().toString());
        ed.putString(SAVED_TEXT6, city.getText().toString());
        ed.putString(SAVED_TEXT7, street.getText().toString());
        ed.putString(SAVED_TEXT8, hnum.getText().toString());
        ed.putString(SAVED_TEXT9, zip.getText().toString());
        ed.commit();
        Toast.makeText(MainActivity.this, "Text saved", Toast.LENGTH_SHORT).show();

    }

    private void loadText() {
        sPref = getPreferences(MODE_PRIVATE);
        String savedText = sPref.getString(SAVED_TEXT, "saved_text");
        String savedText2 = sPref.getString(SAVED_TEXT2, "saved_text2");
        String savedText3 = sPref.getString(SAVED_TEXT3, "saved_text3");
        String savedText4 = sPref.getString(SAVED_TEXT4, "saved_text4");
        String savedText5 = sPref.getString(SAVED_TEXT5, "saved_text5");
        String savedText6 = sPref.getString(SAVED_TEXT6, "saved_text6");
        String savedText7 = sPref.getString(SAVED_TEXT7, "saved_text7");
        String savedText8 = sPref.getString(SAVED_TEXT8, "saved_text8");
        String savedText9 = sPref.getString(SAVED_TEXT9, "saved_text9");
        eT.setText(savedText);
        eT2.setText(savedText2);
        eT3.setText(savedText3);
        eT4.setText(savedText4);
        eT5.setText(savedText5);
        city.setText(savedText6);
        street.setText(savedText7);
        hnum.setText(savedText8);
        zip.setText(savedText9);
        Toast.makeText(MainActivity.this, "Text loaded", Toast.LENGTH_SHORT).show();



    }


}
