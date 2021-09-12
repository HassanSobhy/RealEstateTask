package com.example.realestatetask.presentation.ui.home;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.realestatetask.domain.property.PropertyRepository;

public class HomeViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    PropertyRepository propertyRepository;

    HomeViewModelFactory(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new HomeViewModel(propertyRepository);
    }
}
