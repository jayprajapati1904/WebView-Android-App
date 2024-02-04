package com.example.webviewapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val webview = findViewById<WebView>(R.id.webview)

        webViewSetUp(webview)
        
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun webViewSetUp(webview: WebView) {
        webview.webViewClient = WebViewClient()

        webview.apply {
            settings.javaScriptEnabled =true
            settings.safeBrowsingEnabled = true
            loadUrl("https://jayprajapati1904.github.io/Modern-website-2/")
        }

    }
}