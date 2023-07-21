package com.codewati.demotesting;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Activity context;
    private List<Product> productArrayList;

    public MyAdapter(Activity context, List<Product> productArrayList) {
        this.context = context;
        this.productArrayList = productArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.eachitem, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product currentItem = productArrayList.get(position);
        holder.title.setText(currentItem.getTitle());
        holder.price.setText("₹ " + String.valueOf(currentItem.getPrice()));
        holder.discount.setText("Discount: " + String.valueOf(currentItem.getDiscountPercentage() + "% "));
        holder.description.setText(String.valueOf(currentItem.getDescription()));
        holder.brand.setText(currentItem.getBrand());

        // Load the image using Picasso library
        Picasso.get().load(currentItem.getThumbnail()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, price,brand, description, discount;
        ShapeableImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.productTitle);
            price = itemView.findViewById(R.id.productPrice);
            brand = itemView.findViewById(R.id.productBrandName);
            description = itemView.findViewById(R.id.productDescription);
            discount = itemView.findViewById(R.id.productDiscount);
            image = itemView.findViewById(R.id.productImage);
        }
    }
}