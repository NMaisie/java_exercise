package OOP.car_system;

import java.util.ArrayList;

interface Reviewable{
    void addReview(String reviewText);
}
public abstract class Vehicle implements Reviewable {
    private String make;
    private String model;
    private int year;
    private String review;
    private String type;

    protected Vehicle() {
        this.review = "No review";
        this.type = "undefined";
    }

    public Vehicle(String make, String model, int year, String review, String type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.review = review;
        this.type = type;
    }

    protected Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String getDetailedInfo();

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }

    public void addReview(String reviewText) {
        this.review = reviewText;
    }




        class Truck extends Vehicle {
            private double maxTowWeight;

            public Truck(String make, String model, int year, double maxTowWeight) {
                super(make, model, year);
                this.maxTowWeight = maxTowWeight;
            }

            public double getMaxTowWeight() {
                return maxTowWeight;
            }

            public void setMaxTowWeight(double maxTowWeight) {
                this.maxTowWeight = maxTowWeight;
            }

            @Override
            public String getDetailedInfo() {
                return super.toString() + " (" + type + ")" + "\nMax Tow Weight:" + maxTowWeight + " lbs" + getReview();
            }
        }
    }
