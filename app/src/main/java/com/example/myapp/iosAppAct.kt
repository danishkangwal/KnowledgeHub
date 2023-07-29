package com.example.myapp

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class iosAppAct : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ios_app)

        val iosWebView = findViewById<WebView>(R.id.iosWebView)
        webViewShow(iosWebView)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("SetJavaScriptEnabled")
    private fun webViewShow(iosWebView: WebView){
        iosWebView.webViewClient = WebViewClient()
        iosWebView.apply {
            settings.safeBrowsingEnabled=true
            settings.javaScriptEnabled=true
            loadUrl("https://developer.apple.com/tutorials/app-dev-training")
        }
    }
}