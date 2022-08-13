package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText text;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button save = findViewById(R.id.button2);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preferences = getSharedPreferences("preferences", MODE_PRIVATE);
                SharedPreferences.Editor edit = preferences.edit();

                text = findViewById(R.id.editText);

                edit.putString("text", text.getText().toString());
                edit.apply();

                finish();
            }
        });
    }
}