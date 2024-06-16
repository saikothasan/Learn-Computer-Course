package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_computer_security extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving_computer_security);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);
        getSupportActionBar().setTitle("Computer Security");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_computersecurity);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("computersecurity", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/computersecurityoverview.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/computerantivirus.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/backupandrecovery.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/NETWORK.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/computersecurityelements.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/malwares.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/encryption.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/disasterrecovery.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/computersecuritytermnologies.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/securingOS.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/computersecuritypolicies.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/layersinsecurity.html");
        } else if (intExtra == 12) {
            this.webView.loadUrl("file:///android_asset/securitychecklist.html");
        }
    }

    
    private class mywebviewclient extends WebViewClient {
        @Override 
        public void onReceivedError(WebView webView, int i, String str, String str2) {
        }

        private mywebviewclient() {
        }

        @Override 
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override 
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        @Override 
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }
}
