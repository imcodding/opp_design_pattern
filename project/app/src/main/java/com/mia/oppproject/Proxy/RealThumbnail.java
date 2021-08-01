package com.mia.oppproject.Proxy;

import com.mia.oppproject.ViewInterface;

public class RealThumbnail implements Thumbnail {
    private String title;
    private String videoUrl;
    private ViewInterface viewInterface;

    public RealThumbnail(String title, String videoUrl, ViewInterface viewInterface) {
        this.title = title;
        this.videoUrl = videoUrl;
        this.viewInterface = viewInterface;

        System.out.println(videoUrl + "로부터" + title + "의 영상 데이터 다운로드");

        viewInterface.showView();
    }

    @Override
    public void showTitle() {
        System.out.println("제목: " + title);
    }

    @Override
    public void showPreview() {
        System.out.println(title + "의 프리뷰 재생");
    }
}
