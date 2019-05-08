package com.example.arturs.sms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Advert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advert);

        WebView myWebView = new WebView(this);
        setContentView(myWebView);
        myWebView.loadUrl("https://m.ss.com/lv/construction/garden-technics/film/");
    }
}
