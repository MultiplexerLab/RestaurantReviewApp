package com.example.restaurantreview.Model;

public class Merchant {

    String name, rating, numTrainee, startTime, endTime;

    public Merchant() {
    }

    public Merchant(String name, String rating, String numTrainee, String startTime, String endTime) {
        this.name = name;
        this.rating = rating;
        this.numTrainee = numTrainee;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getNumTrainee() {
        return numTrainee;
    }

    public void setNumTrainee(String numTrainee) {
        this.numTrainee = numTrainee;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
