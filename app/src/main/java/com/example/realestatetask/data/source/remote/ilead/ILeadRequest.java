package com.example.realestatetask.data.source.remote.ilead;

import com.google.gson.annotations.SerializedName;

public class ILeadRequest<T> {

    @SerializedName("appLanguage")
    private String appLanguage;
    @SerializedName("deviceSerial")
    private String deviceSerial;
    @SerializedName("MeasureUnitId")
    private Integer measureUnitId;
    @SerializedName("appversion")
    private String appVersion;
    @SerializedName("notificationToken")
    private String notificationToken;
    @SerializedName("deviceType")
    private Integer deviceType;
    @SerializedName("userId")
    private Integer userId;
    @SerializedName("data")
    private T data;
    @SerializedName("ip")
    private String ip;
    @SerializedName("CurrencyId")
    private Integer currencyId;
    @SerializedName("CountryId")
    private Integer countryId;
    @SerializedName("osversion")
    private String osVersion;

    public String getAppLanguage() {
        return appLanguage;
    }

    public void setAppLanguage(String appLanguage) {
        this.appLanguage = appLanguage;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public Integer getMeasureUnitId() {
        return measureUnitId;
    }

    public void setMeasureUnitId(Integer measureUnitId) {
        this.measureUnitId = measureUnitId;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getNotificationToken() {
        return notificationToken;
    }

    public void setNotificationToken(String notificationToken) {
        this.notificationToken = notificationToken;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }
}