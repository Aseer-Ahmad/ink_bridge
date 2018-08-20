package com.example.newu.exa_ui.Completed;

/**
 * Created by nEW u on 09/03/2018.
 */

public class complete {
    private String title;
    private String hash;
    private int thumbnail;

    public complete(String title, String hash, int thumbnail) {
        this.title = title;
        this.hash = hash;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
