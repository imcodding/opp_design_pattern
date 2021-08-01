package com.mia.oppproject.Proxy;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.mia.oppproject.BaseActivity;
import com.mia.oppproject.ViewInterface;
import com.mia.oppproject.databinding.ActivityProxyBinding;

public class ProxyActivity extends BaseActivity implements ViewInterface {

    ActivityProxyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProxyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ProxyThumbnail proxyThumbnail = new ProxyThumbnail("지구 영상", "./sample.mp4", this::showView);
        binding.tvTitle.setText(proxyThumbnail.getTitle());

        binding.ivVideo.setOnClickListener(v -> { proxyThumbnail.showPreview(); });

    }


    public void startVideo() {
        binding.videoView.setVisibility(View.VISIBLE);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/raw/sample");
        binding.videoView.setVideoURI(uri);
        binding.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                // 준비 완료되면 비디오 재생
                mp.start();
            }
        });
    }

    @Override
    public void showView() {
        startVideo();
    }
}