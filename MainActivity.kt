package com.hobinti.cabreceipt

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val web = WebView(this)
        web.settings.javaScriptEnabled = true
        web.settings.domStorageEnabled = true
        web.settings.allowFileAccess = true
        web.webViewClient = WebViewClient()
        setContentView(web)
        web.loadUrl("file:///android_asset/index.html")
    }

    override fun onBackPressed() {
        val web = findViewById<WebView>(android.R.id.content).getChildAt(0) as? WebView
        if (web?.canGoBack() == true) web.goBack() else super.onBackPressed()
    }
}
