package com.example.realestatetask.domain.property.request;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PropertyRequest {

    @SerializedName("PropertyFurnishingId")
    private Integer propertyFurnishingId;
    @SerializedName("MinBathRoom")
    private Integer minBathRoom;
    @SerializedName("isRented")
    private Integer isRented;
    @SerializedName("keyword")
    private String keyword;
    @SerializedName("MinPrice")
    private Integer minPrice;
    @SerializedName("MinArea")
    private Integer minArea;
    @SerializedName("PropId")
    private Integer propId;
    @SerializedName("AreaId")
    private Integer areaId;
    @SerializedName("CountryId")
    private Integer countryId;
    @SerializedName("CategoryName")
    private String categoryName;
    @SerializedName("CityName")
    private String cityName;
    @SerializedName("PropertyAmenities")
    private List<Object> propertyAmenities = null;
    @SerializedName("LastRowId")
    private Integer lastRowId;
    @SerializedName("CityId")
    private Integer cityId;
    @SerializedName("propertyAdOnsDtos")
    private List<Object> propertyAdOnsDtos = null;
    @SerializedName("IsRentedName")
    private String isRentedName;
    @SerializedName("PropertyTypeName")
    private String propertyTypeName;
    @SerializedName("MaxArea")
    private Integer maxArea;
    @SerializedName("IsFeature")
    private Boolean isFeature;
    @SerializedName("MaxBathRoom")
    private Integer maxBathRoom;
    @SerializedName("MinBedRoom")
    private Integer minBedRoom;
    @SerializedName("MaxPrice")
    private Integer maxPrice;
    @SerializedName("CategoryId")
    private Integer categoryId;
    @SerializedName("FurnishedName")
    private String furnishedName;
    @SerializedName("PropertyTypeId")
    private Integer propertyTypeId;
    @SerializedName("SortTypeId")
    private Integer sortTypeId;
    @SerializedName("MaxBedRoom")
    private Integer maxBedRoom;
    @SerializedName("PropertyCity")
    private List<Object> propertyCity = null;

    public Integer getPropertyFurnishingId() {
        return propertyFurnishingId;
    }

    public void setPropertyFurnishingId(Integer propertyFurnishingId) {
        this.propertyFurnishingId = propertyFurnishingId;
    }

    public Integer getMinBathRoom() {
        return minBathRoom;
    }

    public void setMinBathRoom(Integer minBathRoom) {
        this.minBathRoom = minBathRoom;
    }

    public Integer getIsRented() {
        return isRented;
    }

    public void setIsRented(Integer isRented) {
        this.isRented = isRented;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Integer getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Integer minPrice) {
        this.minPrice = minPrice;
    }

    public Integer getMinArea() {
        return minArea;
    }

    public void setMinArea(Integer minArea) {
        this.minArea = minArea;
    }

    public Integer getPropId() {
        return propId;
    }

    public void setPropId(Integer propId) {
        this.propId = propId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Object> getPropertyAmenities() {
        return propertyAmenities;
    }

    public void setPropertyAmenities(List<Object> propertyAmenities) {
        this.propertyAmenities = propertyAmenities;
    }

    public Integer getLastRowId() {
        return lastRowId;
    }

    public void setLastRowId(Integer lastRowId) {
        this.lastRowId = lastRowId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public List<Object> getPropertyAdOnsDtos() {
        return propertyAdOnsDtos;
    }

    public void setPropertyAdOnsDtos(List<Object> propertyAdOnsDtos) {
        this.propertyAdOnsDtos = propertyAdOnsDtos;
    }

    public String getIsRentedName() {
        return isRentedName;
    }

    public void setIsRentedName(String isRentedName) {
        this.isRentedName = isRentedName;
    }

    public String getPropertyTypeName() {
        return propertyTypeName;
    }

    public void setPropertyTypeName(String propertyTypeName) {
        this.propertyTypeName = propertyTypeName;
    }

    public Integer getMaxArea() {
        return maxArea;
    }

    public void setMaxArea(Integer maxArea) {
        this.maxArea = maxArea;
    }

    public Boolean getIsFeature() {
        return isFeature;
    }

    public void setIsFeature(Boolean isFeature) {
        this.isFeature = isFeature;
    }

    public Integer getMaxBathRoom() {
        return maxBathRoom;
    }

    public void setMaxBathRoom(Integer maxBathRoom) {
        this.maxBathRoom = maxBathRoom;
    }

    public Integer getMinBedRoom() {
        return minBedRoom;
    }

    public void setMinBedRoom(Integer minBedRoom) {
        this.minBedRoom = minBedRoom;
    }

    public Integer getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Integer maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getFurnishedName() {
        return furnishedName;
    }

    public void setFurnishedName(String furnishedName) {
        this.furnishedName = furnishedName;
    }

    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public Integer getSortTypeId() {
        return sortTypeId;
    }

    public void setSortTypeId(Integer sortTypeId) {
        this.sortTypeId = sortTypeId;
    }

    public Integer getMaxBedRoom() {
        return maxBedRoom;
    }

    public void setMaxBedRoom(Integer maxBedRoom) {
        this.maxBedRoom = maxBedRoom;
    }

    public List<Object> getPropertyCity() {
        return propertyCity;
    }

    public void setPropertyCity(List<Object> propertyCity) {
        this.propertyCity = propertyCity;
    }
}