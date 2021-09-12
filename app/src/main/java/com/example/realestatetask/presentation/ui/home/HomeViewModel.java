package com.example.realestatetask.presentation.ui.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.realestatetask.data.source.remote.ilead.ILeadRequest;
import com.example.realestatetask.data.source.remote.ilead.ILeadResponse;
import com.example.realestatetask.domain.property.PropertyRepository;
import com.example.realestatetask.domain.property.entity.Property;
import com.example.realestatetask.domain.property.request.PropertyRequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    private final PropertyRepository propertyRepository;
    MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    MutableLiveData<String> error = new MutableLiveData<>();
    MutableLiveData<List<Property>> sliderProperties = new MutableLiveData<>();
    MutableLiveData<List<Property>> properties = new MutableLiveData<>();

    public HomeViewModel(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public void getSliderProperties(ILeadRequest<PropertyRequest> request) {
        isLoading.setValue(true);

        Call<ILeadResponse<Property>> response = propertyRepository.getSliderProperties(request);
        response.enqueue(new Callback<ILeadResponse<Property>>() {
            @Override
            public void onResponse(Call<ILeadResponse<Property>> call, Response<ILeadResponse<Property>> response) {
                if (response.isSuccessful()) {
                    if (response.body().getResponseCode() == 1) {
                        sliderProperties.setValue(response.body().getData());
                    } else {
                        error.setValue(response.body().getResponseMessage());
                    }
                } else {
                    error.setValue(response.message());
                }
            }

            @Override
            public void onFailure(Call<ILeadResponse<Property>> call, Throwable t) {
                error.setValue(t.getMessage());
            }
        });

        isLoading.setValue(false);
    }

    public void getProperties(ILeadRequest<PropertyRequest> request) {
        isLoading.setValue(true);

        Call<ILeadResponse<Property>> response = propertyRepository.getProperties(request);
        response.enqueue(new Callback<ILeadResponse<Property>>() {
            @Override
            public void onResponse(Call<ILeadResponse<Property>> call, Response<ILeadResponse<Property>> response) {
                if (response.isSuccessful()) {
                    if (response.body().getResponseCode() == 1) {
                        properties.setValue(response.body().getData());
                    } else {
                        error.setValue(response.body().getResponseMessage());
                    }
                } else {
                    error.setValue(response.message());
                }
            }

            @Override
            public void onFailure(Call<ILeadResponse<Property>> call, Throwable t) {
                error.setValue(t.getMessage());
            }
        });

        isLoading.setValue(false);
    }
}