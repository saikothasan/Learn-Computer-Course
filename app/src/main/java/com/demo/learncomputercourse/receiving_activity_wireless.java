package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_wireless extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);



        setContentView(R.layout.activity_receiving_wireless);
        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);
        getSupportActionBar().setTitle("Wireless Communication");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_wireless);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("wireless1", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/overviewwireless.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/wirelesstrends.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/wirelessinternet.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/BLUETOOTH.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/termsinmobile.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/propagationlosses.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/WAN1.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/satellite.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/WAP.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/multipleaccess.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/wirelesschannel1.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/cellularwireless.html");
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
