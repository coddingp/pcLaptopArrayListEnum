package com.company;

public class Pc extends Gadget{
    private double price;
    private String brand;
    private double diagonal;

    public Pc(String type, double price, String brand, double diagonal) {
        super(type);
        this.price = price;
        this.brand = brand;
        this.diagonal = diagonal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (this.price != 0) {
            this.price = price;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", diagonal=" + diagonal +
                '}';
    }
}
