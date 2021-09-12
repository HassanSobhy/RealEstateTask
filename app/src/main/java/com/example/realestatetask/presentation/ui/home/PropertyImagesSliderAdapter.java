package com.example.realestatetask.presentation.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.realestatetask.databinding.PropertyImageItemBinding;
import com.example.realestatetask.databinding.PropertyItemBinding;
import com.example.realestatetask.domain.property.entity.Property;
import com.example.realestatetask.domain.property.entity.PropertyImage;
import com.smarteist.autoimageslider.SliderViewAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class PropertyImagesSliderAdapter extends
        SliderViewAdapter<PropertyImagesSliderAdapter.SliderAdapterViewHolder> {
    private Context context;
    private List<PropertyImage> images = new ArrayList<>();

    public PropertyImagesSliderAdapter(Context context,List<PropertyImage> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public SliderAdapterViewHolder onCreateViewHolder(ViewGroup parent) {
        return SliderAdapterViewHolder.from(parent);
    }

    @Override
    public void onBindViewHolder(SliderAdapterViewHolder viewHolder, int position) {
        viewHolder.bind(position, images);
    }

    @Override
    public int getCount() {
        return images.size();
    }


    static class SliderAdapterViewHolder extends SliderViewAdapter.ViewHolder {

        PropertyImageItemBinding binding;

        public SliderAdapterViewHolder(@NonNull PropertyImageItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        static PropertyImagesSliderAdapter.SliderAdapterViewHolder from(ViewGroup parent) {
            return new PropertyImagesSliderAdapter.SliderAdapterViewHolder(PropertyImageItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }

        public void bind(int position, List<PropertyImage> images) {
            Picasso.get().load(images.get(position).getUrl()).into(binding.ivImage);

        }
    }
}
