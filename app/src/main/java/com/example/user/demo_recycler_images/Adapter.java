package com.example.user.demo_recycler_images;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.PreviewImageViewHolder> {

    List<Integer> images;
    Context context;
    ImageView imageView2;

    public Adapter( List<Integer> images, Context context, ImageView image) {
        this.images = images;
        this.context = context;
        this.imageView2 = image;
    }

    @Override
    public PreviewImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.item, parent, false);
        return new PreviewImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final PreviewImageViewHolder holder, final int position) {
        holder.imageView.setImageResource(images.get(position));
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView2.setImageResource(images.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.size();
    }


    class PreviewImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        PreviewImageViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
