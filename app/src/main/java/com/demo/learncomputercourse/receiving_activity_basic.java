package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_basic extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving_basic);


        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_basic);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("key1", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/basic.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/functionOS.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/utility.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/systemsoftware.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/classification.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/officetools.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/softwareconcept.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/primary.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/secondary.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/domainspecifictools.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/inputoutputport.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/microprocessorconcepts.html");
        } else if (intExtra == 12) {
            this.webView.loadUrl("file:///android_asset/microprocessorevaluation.html");
        } else if (intExtra == 13) {
            this.webView.loadUrl("file:///android_asset/opensourcesoftware.html");
        } else if (intExtra == 14) {
            this.webView.loadUrl("file:///android_asset/typesOS.html");
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
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }

        @Override 
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }
    }
}
