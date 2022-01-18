package com.company;

public class LapTop extends Gadget{
    private double price;
    private String brand;

    public LapTop(String type, double price, String brand) {
        super(type);
        this.price = price;
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
