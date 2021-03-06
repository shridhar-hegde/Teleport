package com.team7.sss.teleport;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FeedbackFragment extends Fragment
{

    WebView myWebView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.feedback, null);


    }


    @Override
    public void onStart()
    {
        super.onStart();

        myWebView = (WebView) getActivity().findViewById(R.id.webview);

        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSdvD1onBE9w5FBCFsYVepInjsmuVgUQ-x1muEYiATozn5F93g/viewform?usp=sf_link");


    }

}