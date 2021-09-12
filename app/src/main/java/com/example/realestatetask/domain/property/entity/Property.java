package com.example.realestatetask.domain.property.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

public class Property {

    @SerializedName("id")
    private Integer id;
    @SerializedName("price")
    private String price;
    @SerializedName("address")
    private String address;
    @SerializedName("category")
    private String category;
    @SerializedName("bedRoom")
    private Double bedRoom;
    @SerializedName("bathRoom")
    private Double bathRoom;
    @SerializedName("areaSpace")
    private Double areaSpace;
    @SerializedName("propertyImages")
    private List<PropertyImage> propertyImages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(Double bedRoom) {
        this.bedRoom = bedRoom;
    }

    public Double getBathRoom() {
        return bathRoom;
    }

    public void setBathRoom(Double bathRoom) {
        this.bathRoom = bathRoom;
    }

    public Double getAreaSpace() {
        return areaSpace;
    }

    public void setAreaSpace(Double areaSpace) {
        this.areaSpace = areaSpace;
    }

    public List<PropertyImage> getPropertyImages() {
        return propertyImages;
    }

    public void setPropertyImages(List<PropertyImage> propertyImages) {
        this.propertyImages = propertyImages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return Objects.equals(id, property.id) && Objects.equals(price, property.price) && Objects.equals(address, property.address) && Objects.equals(category, property.category) && Objects.equals(bedRoom, property.bedRoom) && Objects.equals(bathRoom, property.bathRoom) && Objects.equals(areaSpace, property.areaSpace) && Objects.equals(propertyImages, property.propertyImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, address, category, bedRoom, bathRoom, areaSpace, propertyImages);
    }
}