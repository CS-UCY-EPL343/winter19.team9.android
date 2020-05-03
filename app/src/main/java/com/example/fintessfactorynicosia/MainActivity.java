package com.example.fintessfactorynicosia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button aboutUs = findViewById(R.id.about);
        final Button login =  findViewById(R.id.login);
        final ImageView logo = findViewById(R.id.imageView5);
        final Button classes = findViewById(R.id.classes);
        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView = (WebView) findViewById(R.id.webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://10.0.2.2:3000/about");

                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setSupportZoom(true);
                webSettings.setLoadWithOverviewMode(true);
                webSettings.setUseWideViewPort(true);

                login.setVisibility(View.INVISIBLE);
                aboutUs.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.INVISIBLE);
                classes.setVisibility(View.INVISIBLE);
                webView.setVisibility(View.VISIBLE);


            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView = (WebView) findViewById(R.id.webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://10.0.2.2:3000/loginAndroid");

                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setSupportZoom(true);
                webSettings.setLoadWithOverviewMode(true);
                webSettings.setUseWideViewPort(true);

                login.setVisibility(View.INVISIBLE);
                aboutUs.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.INVISIBLE);
                classes.setVisibility(View.INVISIBLE);
                webView.setVisibility(View.VISIBLE);


            }
        });
        classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webView = (WebView) findViewById(R.id.webview);
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl("http://10.0.2.2:3000/classes");

                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setSupportZoom(true);
                webSettings.setLoadWithOverviewMode(true);
                webSettings.setUseWideViewPort(true);

                login.setVisibility(View.INVISIBLE);
                aboutUs.setVisibility(View.INVISIBLE);
                logo.setVisibility(View.INVISIBLE);
                classes.setVisibility(View.INVISIBLE);
                webView.setVisibility(View.VISIBLE);


            }
        });

        //     webView = (WebView) findViewById(R.id.webview);
        //    webView.setWebViewClient(new WebViewClient());
        //    webView.loadUrl("http://10.0.2.2:3000/");

//        WebSettings webSettings = webView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        webSettings.setDomStorageEnabled(true);
//        webSettings.setSupportZoom(true);
//        webSettings.setLoadWithOverviewMode(true);
//        webSettings.setUseWideViewPort(true);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}