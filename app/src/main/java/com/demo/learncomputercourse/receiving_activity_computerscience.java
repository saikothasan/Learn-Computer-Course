package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_computerscience extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving_computerscience);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_computerscience);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("sci", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/fundamentalconcepts.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/computersecurity.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/development.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/multimedia.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/threat.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/dataprocessing.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/programminglanguage.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/electroniccommerce.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/networkterminology.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/abbreviations.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/computerjobs.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/SDLC.html");
        } else if (intExtra == 12) {
            this.webView.loadUrl("file:///android_asset/algorithm.html");
        } else if (intExtra == 13) {
            this.webView.loadUrl("file:///android_asset/computervirus.html");
        } else if (intExtra == 14) {
            this.webView.loadUrl("file:///android_asset/desktopelements.html");
        } else if (intExtra == 15) {
            this.webView.loadUrl("file:///android_asset/analogdigital.html");
        } else if (intExtra == 16) {
            this.webView.loadUrl("file:///android_asset/roleofcomputer.html");
        } else if (intExtra == 17) {
            this.webView.loadUrl("file:///android_asset/interintra.html");
        } else if (intExtra == 18) {
            this.webView.loadUrl("file:///android_asset/extranet.html");
        } else if (intExtra == 19) {
            this.webView.loadUrl("file:///android_asset/computersystem.html");
        } else if (intExtra == 20) {
            this.webView.loadUrl("file:///android_asset/innovators.html");
        } else if (intExtra == 21) {
            this.webView.loadUrl("file:///android_asset/mobile.html");
        } else if (intExtra == 22) {
            this.webView.loadUrl("file:///android_asset/shortcutkeys.html");
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
