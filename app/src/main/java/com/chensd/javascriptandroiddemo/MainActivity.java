package com.chensd.javascriptandroiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWeb = (WebView) findViewById(R.id.webview);

        WebSettings settings = mWeb.getSettings();
        // settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setJavaScriptEnabled(true);
        // settings.setSupportZoom(true);
        // settings.setBuiltInZoomControls(true);
        // settings.setUseWideViewPort(true);
        // settings.setLoadWithOverviewMode(true);
        settings.setAppCacheEnabled(true);
        settings.setDomStorageEnabled(true);

        mWeb.setWebViewClient(new WebViewClient());
        mWeb.setWebChromeClient(new WebChromeClient());
        mWeb.addJavascriptInterface(new JavaScriptKit(this), "android");
        mWeb.loadUrl("file:///android_asset/phone.html");
    }
}
