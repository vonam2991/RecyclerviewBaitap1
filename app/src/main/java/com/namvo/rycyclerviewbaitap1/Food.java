package com.namvo.rycyclerviewbaitap1;

public class Food {
    private  String Name;
    private  Double Price;
    private  String Address;
    private  int Image;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public Food(String name, Double price, String address, int image) {
        Name = name;
        Price = price;
        Address = address;
        Image = image;
    }
}
