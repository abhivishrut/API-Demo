package com.codewati.demotesting;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("products")
    Call<MyData> getProductData();

}