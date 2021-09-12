package com.example.realestatetask.presentation.ui.home;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.example.realestatetask.databinding.PropertyItemBinding;
import com.example.realestatetask.databinding.PropertySliderItemBinding;
import com.example.realestatetask.domain.property.entity.Property;
import com.squareup.picasso.Picasso;

public class PropertyAdapter extends ListAdapter<Property, RecyclerView.ViewHolder> {

    public static final DiffUtil.ItemCallback<Property> DIFF_CALLBACK = new DiffUtil.ItemCallback<Property>() {

        @Override
        public boolean areItemsTheSame(@NonNull Property oldItem, @NonNull Property newItem) {
            return oldItem.getId().equals(newItem.getId());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Property oldItem, @NonNull Property newItem) {
            return oldItem.equals(newItem);
        }
    };

    PropertyViewType propertyViewType;

    public PropertyAdapter(PropertyViewType propertyViewType) {
        super(DIFF_CALLBACK);
        this.propertyViewType = propertyViewType;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (propertyViewType) {
            case SLIDER:
                return PropertySliderViewHolder.from(parent);
            case NORMAL:
                return PropertyViewHolder.from(parent);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof PropertySliderViewHolder) {
            ((PropertySliderViewHolder) holder).bind(getItem(position));
        } else if (holder instanceof PropertyViewHolder) {
            ((PropertyViewHolder) holder).bind(getItem(position));
        }
    }

    enum PropertyViewType {
        SLIDER,
        NORMAL
    }

    static class PropertySliderViewHolder extends RecyclerView.ViewHolder {

        PropertySliderItemBinding binding;

        public PropertySliderViewHolder(@NonNull PropertySliderItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        static PropertySliderViewHolder from(ViewGroup parent) {
            return new PropertySliderViewHolder(PropertySliderItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }

        public void bind(Property property) {
            Picasso.get().load(property.getPropertyImages().get(0).getUrl()).into(binding.ivImage);
            binding.tvCategory.setText(property.getCategory());
            binding.tvPrice.setText(property.getPrice());
            binding.tvAddress.setText(property.getAddress());
            binding.tvBedrooms.setText(property.getBedRoom().toString());
            binding.tvBathrooms.setText(property.getBathRoom().toString());
            binding.tvArea.setText(property.getAreaSpace().toString());
        }
    }

    static class PropertyViewHolder extends RecyclerView.ViewHolder {

        PropertyItemBinding binding;

        public PropertyViewHolder(@NonNull PropertyItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        static PropertyViewHolder from(ViewGroup parent) {
            return new PropertyViewHolder(PropertyItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
        }

        public void bind(Property property) {
            PropertyImagesSliderAdapter propertyImagesSliderAdapter = new PropertyImagesSliderAdapter(itemView.getContext(), property.getPropertyImages());
            binding.svSlider.setSliderAdapter(propertyImagesSliderAdapter);
            binding.tvCategory.setText(property.getCategory());
            binding.tvPrice.setText(property.getPrice());
            binding.tvAddress.setText(property.getAddress());
            binding.tvBedrooms.setText(property.getBedRoom().toString());
            binding.tvBathrooms.setText(property.getBathRoom().toString());
            binding.tvArea.setText(property.getAreaSpace().toString());
        }
    }
}