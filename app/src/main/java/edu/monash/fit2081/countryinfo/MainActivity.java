package edu.monash.fit2081.countryinfo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();


        String message=intent.getStringExtra("country");
        WebView webview = new WebView(this);
        setContentView(webview);
        webview.loadUrl("https://en.wikipedia.org/wiki/"+message);
        Wiki wiki=new Wiki();
        getFragmentManager().beginTransaction().add(R.id.wikiPage,wiki).commit();

    }
}
