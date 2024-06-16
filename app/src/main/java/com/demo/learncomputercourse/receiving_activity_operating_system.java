package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_operating_system extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving_operating_system);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        getSupportActionBar().setTitle("Operating System");
        WebView webView = (WebView) findViewById(R.id.webview_operatingsystem);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("key3", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/osoverview.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/typesofos.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/systemprocess.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/systemservices.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/oshardware.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/ossoftware.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/ossecurity.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/osmultithreading.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/osfilesystem.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/osmemorymanage.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/osvirtualmemory.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/osproperties.html");
        } else if (intExtra == 12) {
            this.webView.loadUrl("file:///android_asset/osschedulingprocess.html");
        } else if (intExtra == 13) {
            this.webView.loadUrl("file:///android_asset/osschedulingalgorithm.html");
        } else if (intExtra == 14) {
            this.webView.loadUrl("file:///android_asset/oslinux.html");
        }
    }

    
    private class mywebviewclient extends WebViewClient {
        @Override 
        public void onPageFinished(WebView webView, String str) {
        }

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
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }
    }
}
