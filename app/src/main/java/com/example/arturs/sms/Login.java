package com.example.arturs.sms;

import android.Manifest;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    DatabaseHelper db;
    Cursor cursor1;

    private ImageButton login;
    private TextView user, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        hideSystemUI();

        db = new DatabaseHelper(this);
        user = findViewById(R.id.txt_user);
        password = findViewById(R.id.txt_password);

        login = findViewById(R.id.btnLogin2);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fuser = user.getText().toString();
                String fpass = password.getText().toString();
                Boolean res = db.checkUser(fuser, fpass);
                if (res == true) {
                    MainSMS();
                } else {
                    Toast.makeText(Login.this, "Login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void MainSMS(){
        Intent intent = new Intent(this, MainSMS.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void hideSystemUI(){
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
    }
}
