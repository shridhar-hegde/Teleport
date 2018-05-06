package com.team7.sss.teleport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FeedFragment extends Fragment
{

    WebView myWebView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.feed, null);


    }



    @Override
    public void onStart()
    {
        super.onStart();

        myWebView = (WebView) getActivity().findViewById(R.id.webview);

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.getSettings().setBuiltInZoomControls(true);
        myWebView.loadUrl("https://santoshguna001.github.io");


    }

}