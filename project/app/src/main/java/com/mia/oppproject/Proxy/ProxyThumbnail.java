package com.mia.oppproject.Proxy;

import com.mia.oppproject.ViewInterface;

public class ProxyThumbnail implements Thumbnail{
    private String title;
    private String videoUrl;
    private ViewInterface viewInterface;
    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String title, String videoUrl, ViewInterface viewInterface) {
        this.title = title;
        this.videoUrl = videoUrl;
        this.viewInterface = viewInterface;
    }

    @Override
    public void showTitle() {
        System.out.println("제목: " + title);
    }

    @Override
    public void showPreview() {
        if(realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, videoUrl, viewInterface);
        }
        realThumbnail.showPreview();
    }

    public String getTitle() {
        return title;
    }
}
