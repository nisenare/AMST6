package com.example.appamst6.ui.youtube;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.appamst6.databinding.FragmentYoutubeBinding;

public class YoutubeFragment extends Fragment {

    private FragmentYoutubeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        YoutubeViewModel youtubeViewModel =
            new ViewModelProvider(this).get(YoutubeViewModel.class);

        binding = FragmentYoutubeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final WebView webView = binding.webView;
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        youtubeViewModel.getVideo().observe(getViewLifecycleOwner(), webView::loadUrl);
        webView.setWebChromeClient(new WebChromeClient());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}