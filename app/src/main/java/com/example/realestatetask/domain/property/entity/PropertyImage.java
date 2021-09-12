package com.example.realestatetask.domain.property.entity;

import com.google.gson.annotations.SerializedName;

public class PropertyImage {

    @SerializedName("id")
    private Integer id;
    @SerializedName("url")
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}