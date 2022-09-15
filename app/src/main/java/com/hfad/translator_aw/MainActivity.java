package com.hfad.translator_aw;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnTranslate;
    private Spinner spLanguages;
    private TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTranslate = findViewById(R.id.btn_translate);
        spLanguages = findViewById(R.id.sp_languages);
        tvOutput = findViewById(R.id.textView);


        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (spLanguages.getSelectedItem().toString().equals("English")) {
                    tvOutput.setText("Welcome");
                } else if (spLanguages.getSelectedItem().toString().equals("Spanish")) {
                    tvOutput.setText("Bienvenido");
                } else if (spLanguages.getSelectedItem().toString().equals("French")) {
                    tvOutput.setText("Bienvenue");
                } else if (spLanguages.getSelectedItem().toString().equals("German")) {
                    tvOutput.setText("Willkommen");
                } else {
                    tvOutput.setText("Benvenuto");
                }
            }
        });
    }
}