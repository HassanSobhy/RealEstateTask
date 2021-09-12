package com.example.realestatetask.data.source.remote.ilead;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ILeadResponse<T> {

    @SerializedName("responseCode")
    private Integer responseCode;
    @SerializedName("responseMessageEn")
    private String responseMessageEn;
    @SerializedName("responseMessageAr")
    private String responseMessageAr;
    @SerializedName("responseMessage")
    private String responseMessage;
    @SerializedName("responseRemark")
    private String responseRemark;
    @SerializedName("data")
    private List<T> data = null;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessageEn() {
        return responseMessageEn;
    }

    public void setResponseMessageEn(String responseMessageEn) {
        this.responseMessageEn = responseMessageEn;
    }

    public String getResponseMessageAr() {
        return responseMessageAr;
    }

    public void setResponseMessageAr(String responseMessageAr) {
        this.responseMessageAr = responseMessageAr;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseRemark() {
        return responseRemark;
    }

    public void setResponseRemark(String responseRemark) {
        this.responseRemark = responseRemark;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}