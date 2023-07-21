package com.codewati.demotesting;

import java.util.List;

public class MyData {
    private int limit;
    private List<Product> products;
    private int skip;
    private int total;

    public MyData(int limit, List<Product> products, int skip, int total) {
        this.limit = limit;
        this.products = products;
        this.skip = skip;
        this.total = total;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
