package com.codewati.demotesting;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://dummyjson.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<MyData> retrofitData = apiInterface.getProductData();

        retrofitData.enqueue(new Callback<MyData>() {

            @Override
            public void onResponse(Call<MyData> call, Response<MyData> response) {
                // if api call is a success, then use the data of API and show in your app
                MyData responseBody = response.body();
                if (responseBody != null) {
                    List<Product> productList = responseBody.getProducts();

                    myAdapter = new MyAdapter(MainActivity.this, productList);
                    recyclerView.setAdapter(myAdapter);
                    recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                }
            }

            @Override
            public void onFailure(Call<MyData> call, Throwable t) {
                // if api call fails
                Log.d("Main Activity", "onFailure: " + t.getMessage());
            }
        });
    }
}