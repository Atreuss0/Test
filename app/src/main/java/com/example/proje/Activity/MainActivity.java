package com.example.proje.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.proje.R;

public class MainActivity extends AppCompatActivity {

    private EditText UserName,Password;
    private Button btn_Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName=findViewById(R.id.UserName);
        Password=findViewById(R.id.Password);
        btn_Login=findViewById(R.id.btn_login);


        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, LessonActivity.class));

            }

        });

    }
}