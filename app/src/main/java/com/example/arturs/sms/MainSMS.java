package com.example.arturs.sms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainSMS extends AppCompatActivity {

    private ImageButton btnStorage;
    private ImageButton btnSilage;
    private ImageButton btnAdvert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sms);

        btnStorage = (ImageButton)findViewById(R.id.btnStorage);
        btnStorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Storage();
            }
        });
        btnSilage = (ImageButton)findViewById(R.id.btnSilage);
        btnSilage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Silage();
            }
        });
        btnAdvert = (ImageButton)findViewById(R.id.btnAdvert);
        btnAdvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                History();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.mybutton) {
            Login();
        }
        return super.onOptionsItemSelected(item);
    }

    public void Login(){
        Intent intent = new Intent(this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    public void Storage(){
        Intent intent = new Intent(this, Storage.class);
        startActivity(intent);
    }
    public void Silage(){
        Intent intent = new Intent(this, Silage.class);
        startActivity(intent);
    }
    public void History(){
        Intent intent = new Intent(this, Advert.class);
        startActivity(intent);
    }

}
