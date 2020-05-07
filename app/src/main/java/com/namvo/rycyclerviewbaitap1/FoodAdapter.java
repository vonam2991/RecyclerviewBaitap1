package com.namvo.rycyclerviewbaitap1;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {
    private List<Food> mFoodList;

    public FoodAdapter(List<Food> mFoodList) {
        this.mFoodList = mFoodList;
    }

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (mFoodList != null) {
            return mFoodList.size();
        }
        return 0;
    }

    class FoodHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txtName, txtPrice, txtAddress;

        // format code Ctrl + Alt + L
        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgImage);
            txtName = itemView.findViewById(R.id.txtName);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }
    }
}
