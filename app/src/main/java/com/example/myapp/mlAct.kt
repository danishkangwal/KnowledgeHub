package com.example.myapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class mlAct : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ml)

        val mlWebView = findViewById<WebView>(R.id.mlWebView)
        webViewShow(mlWebView)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewShow(mlWebView: WebView){
        mlWebView.webViewClient = WebViewClient()
        mlWebView.apply {
            settings.safeBrowsingEnabled=true
            settings.javaScriptEnabled=true
            loadUrl("https://developers.google.com/machine-learning")
        }
    }
}