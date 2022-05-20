package com.example.toppage;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class TaikenWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taiken_web);



        WebView myWebView = (WebView) findViewById(R.id.webView2);
        myWebView.setWebViewClient(new WebViewClient());
        Object https;
        myWebView.loadUrl("file:///android_asset/1_MatchingTop.html");

    }

}
