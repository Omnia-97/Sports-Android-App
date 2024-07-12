package com.example.thesportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.SportsViewHolder> {

    private List<Sport> sportList;
    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public CustomAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout,parent,false);
        return new SportsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        Sport sport = sportList.get(position);

        holder.imageView.setImageResource(sport.getImage());
        holder.textView.setText(sport.getTitleText());

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public  class SportsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
      ImageView imageView;
      TextView textView;

        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.titleTextView);
            itemView.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            if (clickListener != null) {
                clickListener.onClick(getAdapterPosition(),v);
            }

        }
    }
}
