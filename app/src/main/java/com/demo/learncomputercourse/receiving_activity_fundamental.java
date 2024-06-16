package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_fundamental extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receivingactivity);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_fundamental);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("key", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/overview.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/Appli.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/gen.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/types.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/compo.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/cpu.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/input.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/output.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/memory.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/RAM.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/ROM.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/mthrboard.html");
        } else if (intExtra == 12) {
            this.webView.loadUrl("file:///android_asset/memryunit.html");
        } else if (intExtra == 13) {
            this.webView.loadUrl("file:///android_asset/port.html");
        } else if (intExtra == 14) {
            this.webView.loadUrl("file:///android_asset/hardware.html");
        } else if (intExtra == 15) {
            this.webView.loadUrl("file:///android_asset/software.html");
        } else if (intExtra == 16) {
            this.webView.loadUrl("file:///android_asset/nmbrsystem.html");
        } else if (intExtra == 17) {
            this.webView.loadUrl("file:///android_asset/nmbrcnvrsion.html");
        } else if (intExtra == 18) {
            this.webView.loadUrl("file:///android_asset/datainfo.html");
        } else if (intExtra == 19) {
            this.webView.loadUrl("file:///android_asset/networking.html");
        } else if (intExtra == 20) {
            this.webView.loadUrl("file:///android_asset/operating.html");
        } else if (intExtra == 21) {
            this.webView.loadUrl("file:///android_asset/interintra.html");
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
