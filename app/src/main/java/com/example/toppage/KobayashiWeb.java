package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KobayashiWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kobayashi_web);


        WebView myWebView = (WebView) findViewById(R.id.webView3);
        myWebView.setWebViewClient(new WebViewClient());
        Object https;
        myWebView.loadUrl("https://www.google.com/");
    }
}