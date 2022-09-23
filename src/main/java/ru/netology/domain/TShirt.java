package ru.netology.domain;


public class TShirt extends Product {
    String manufacturer;

    public TShirt(int id, String title, int price, String manufacturer) {
        super(id, title, price);
        this.manufacturer = manufacturer;
    }
}