package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_networksecurity extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving_networksecurity);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Network Security");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_networksecurity);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("network", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/overviewnetworksecurity.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/applicationlayernetwok.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/transportlayernetwork.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/networklayernetwork.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/datalinknetwork.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/accesscontrolnetwork.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/firewallnetwork.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/criticalnecessity.html");
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
