package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_MS_powerpoint_basic extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving__m_s_powerpoint_basic);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Microsoft PowerPoint");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_MS_ppt_basic);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("ppt1", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/powerpoint.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/explorewindowppt.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/backstagepowerpoint.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/presentationppt.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/pptslides.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/addingtextppt.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/newtextboxesppt.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/deletingslidesppt.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/rearrangingslidesppt.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/speakernotesppt.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/managingsectionppt.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/workingoutlinesppt.html");
        } else if (intExtra == 12) {
            this.webView.loadUrl("file:///android_asset/slidethumbnailsppt.html");
        } else if (intExtra == 13) {
            this.webView.loadUrl("file:///android_asset/presentationviewppt.html");
        } else if (intExtra == 14) {
            this.webView.loadUrl("file:///android_asset/settingbackground.html");
        } else if (intExtra == 15) {
            this.webView.loadUrl("file:///android_asset/slideorientationppt.html");
        } else if (intExtra == 16) {
            this.webView.loadUrl("file:///android_asset/savingpresentationppt.html");
        } else if (intExtra == 17) {
            this.webView.loadUrl("file:///android_asset/reviewpresentationppt.html");
        } else if (intExtra == 18) {
            this.webView.loadUrl("file:///android_asset/slidenumbersppt.html");
        } else if (intExtra == 19) {
            this.webView.loadUrl("file:///android_asset/headerfooterppt.html");
        } else if (intExtra == 20) {
            this.webView.loadUrl("file:///android_asset/slideshowppt.html");
        } else if (intExtra == 21) {
            this.webView.loadUrl("file:///android_asset/shortcutkeysppt.html");
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
