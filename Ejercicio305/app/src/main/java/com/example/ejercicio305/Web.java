package com.example.ejercicio305;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Web extends AppCompatActivity {

    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();

        web = (WebView) findViewById(R.id.web);

        web.setWebViewClient(new WebViewClient());
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);

        web.loadUrl("https://google.es");

    }
}