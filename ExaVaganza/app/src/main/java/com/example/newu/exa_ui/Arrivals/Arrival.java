package com.example.newu.exa_ui.Arrivals;

/**
 * Created by nEW u on 10/04/2018.
 */

public class Arrival {

    private String name;
    private String date_time;
    private int thumbnail;
    private String hash;
    private int likes;

    public Arrival(String name, String date_time, int thumbnail, String hash, int likes) {
        this.name = name;
        this.date_time = date_time;
        this.thumbnail = thumbnail;
        this.hash = hash;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
