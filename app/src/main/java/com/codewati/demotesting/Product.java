package com.codewati.demotesting;

import java.util.List;

public class Product {
    private String brand;
    private String category;
    private String description;
    private double discountPercentage;
    private int id;
    private List<String> images;
    private int price;
    private double rating;
    private int stock;
    private String thumbnail;
    private String title;

    public Product(String brand, String category, String description, double discountPercentage,
                   int id, List<String> images, int price, double rating, int stock,
                   String thumbnail, String title) {
        this.brand = brand;
        this.category = category;
        this.description = description;
        this.discountPercentage = discountPercentage;
        this.id = id;
        this.images = images;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
        this.thumbnail = thumbnail;
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
