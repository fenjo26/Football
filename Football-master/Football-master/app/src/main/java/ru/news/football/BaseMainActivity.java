package vido.luka.chorvatkia;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.scottyab.aescrypt.AESCrypt;

import java.security.GeneralSecurityException;

import vido.luka.chorvatkia.utls.StaticDatabase;
import vido.luka.chorvatkia.utls.TryNetwork;

public abstract class BaseMainActivity extends AppCompatActivity {
    protected boolean isWebView;
    protected WebView webView;
    @Override
    protected void onResume() {
        super.onResume();
        tryInternet();
    }

    private void tryInternet() {
        if (TryNetwork.check()) {
            isWebView = true;
            setContentView(R.layout.layout_webview);
            webView = findViewById(R.id.webview);
            webView.setWebViewClient(new WebViewClient() {
                @Override
                public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                    super.onReceivedError(view, request, error);
                    tryInternet();
                }
            });
            webView.setWebChromeClient(new WebChromeClient());
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setLoadsImagesAutomatically(true);
            webView.getSettings().setDomStorageEnabled(true);
            try {
                Log.d("DECRYPT", AESCrypt.decrypt(StaticDatabase.AESpassword, StaticDatabase.encryptedUrl));
                webView.loadUrl(AESCrypt.decrypt(StaticDatabase.AESpassword, StaticDatabase.encryptedUrl));
            } catch (GeneralSecurityException e){}
        } else {
            isWebView = false;
            onNormalResume();
        }

    }

    protected void setView(String title, int image, String text) {
        ((TextView)findViewById(R.id.title)).setText(title);
        findViewById(R.id.news_image).setBackgroundResource(image);
        ((TextView)findViewById(R.id.text)).setText(text);
    }

    protected abstract void onNormalResume();

    @Override
    public void onBackPressed() {
        if (!isWebView) {
            super.onBackPressed();
        } else {
            if (webView.canGoBack()) {
                webView.goBack();
            }
        }
    }
}
