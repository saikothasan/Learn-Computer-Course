package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_MS_powerpoint_WorkingMultimedia extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving__m_s_powerpoint__working_multimedia);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);
        getSupportActionBar().setTitle("Microsoft PowerPoint");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_MS_ppt_multimedia);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("ppt4", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/addpicppt.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/editpicppt.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/formatpicppt.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/insertscreenshotppt.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/addshapeppt.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/editshapeppt.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/formataddedshape.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/addingtextshapeppt.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/arrangeshapesppt.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/groupobjectsppt.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/addaudioppt.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/addformattableppt.html");
        } else if (intExtra == 12) {
            this.webView.loadUrl("file:///android_asset/addchartppt.html");
        } else if (intExtra == 13) {
            this.webView.loadUrl("file:///android_asset/addsmartartppt.html");
        } else if (intExtra == 14) {
            this.webView.loadUrl("file:///android_asset/addanimationppt.html");
        } else if (intExtra == 15) {
            this.webView.loadUrl("file:///android_asset/addtransitionppt.html");
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
