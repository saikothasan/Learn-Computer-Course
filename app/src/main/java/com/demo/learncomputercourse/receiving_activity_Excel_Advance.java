package com.demo.learncomputercourse;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.learncomputercourse.R;


public class receiving_activity_Excel_Advance extends AppCompatActivity {
   
    WebView webView;

    
    @Override 
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_receiving__excel__advance);

        AdAdmob adAdmob = new AdAdmob( this);
        adAdmob.BannerAd((RelativeLayout) findViewById(R.id.banner), this);
        adAdmob.FullscreenAd_Counter(this);

        getSupportActionBar().setTitle("Microsoft Excel");
        getSupportActionBar().setBackgroundDrawable(getDrawable(R.drawable.toolbar_bg));
      
        WebView webView = (WebView) findViewById(R.id.webview_excel_Advance);
        this.webView = webView;
        webView.setWebViewClient(new mywebviewclient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        int intExtra = getIntent().getIntExtra("excel6", 0);
        if (intExtra == 0) {
            this.webView.loadUrl("file:///android_asset/datafilteringexcel.html");
        } else if (intExtra == 1) {
            this.webView.loadUrl("file:///android_asset/datasortingexcel.html");
        } else if (intExtra == 2) {
            this.webView.loadUrl("file:///android_asset/rangeexcel.html");
        } else if (intExtra == 3) {
            this.webView.loadUrl("file:///android_asset/datavalidationexcel.html");
        } else if (intExtra == 4) {
            this.webView.loadUrl("file:///android_asset/styleexcel.html");
        } else if (intExtra == 5) {
            this.webView.loadUrl("file:///android_asset/themeexcel.html");
        } else if (intExtra == 6) {
            this.webView.loadUrl("file:///android_asset/templeteexcel.html");
        } else if (intExtra == 7) {
            this.webView.loadUrl("file:///android_asset/macroexcel.html");
        } else if (intExtra == 8) {
            this.webView.loadUrl("file:///android_asset/addgraphic.html");
        } else if (intExtra == 9) {
            this.webView.loadUrl("file:///android_asset/crossrefrencing1.html");
        } else if (intExtra == 10) {
            this.webView.loadUrl("file:///android_asset/printsheetexcel.html");
        } else if (intExtra == 11) {
            this.webView.loadUrl("file:///android_asset/emailworkbookexcel.html");
        } else if (intExtra == 12) {
            this.webView.loadUrl("file:///android_asset/translateworksheetexcel.html");
        } else if (intExtra == 13) {
            this.webView.loadUrl("file:///android_asset/workbooksecurity.html");
        } else if (intExtra == 14) {
            this.webView.loadUrl("file:///android_asset/datatableexcel.html");
        } else if (intExtra == 15) {
            this.webView.loadUrl("file:///android_asset/simplechartexcel.html");
        } else if (intExtra == 16) {
            this.webView.loadUrl("file:///android_asset/keyboardshortcutexcel.html");
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
