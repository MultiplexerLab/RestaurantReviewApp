package com.example.restaurantreview.Model;

public class Review {

    String name, address, picId, rating;

    public Review() {
    }

    public Review(String name, String address, String picId, String rating) {
        this.name = name;
        this.address = address;
        this.picId = picId;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPicId() {
        return picId;
    }

    public void setPicId(String picId) {
        this.picId = picId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
