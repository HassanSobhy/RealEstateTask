package com.example.realestatetask.presentation.ui.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.realestatetask.data.source.remote.ilead.ILeadRequest;
import com.example.realestatetask.data.source.remote.ilead.ILeadResponse;
import com.example.realestatetask.domain.property.PropertyRepository;
import com.example.realestatetask.domain.property.entity.Property;
import com.example.realestatetask.domain.property.request.PropertyRequest;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;


public class HomeViewModel extends ViewModel {

    private final PropertyRepository propertyRepository;
    MutableLiveData<Boolean> isLoading = new MutableLiveData<>();
    MutableLiveData<String> error = new MutableLiveData<>();
    MutableLiveData<List<Property>> sliderProperties = new MutableLiveData<>();
    MutableLiveData<List<Property>> properties = new MutableLiveData<>();


    public HomeViewModel(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    private void handleSliderResults(ILeadResponse<Property> data) {
        sliderProperties.setValue(data.getData());
    }

    private void handlePropertiesResults(ILeadResponse<Property> data) {
        properties.setValue(data.getData());
    }

    public void getSliderProperties(ILeadRequest<PropertyRequest> request) {
        isLoading.setValue(true);

        Observable<ILeadResponse<Property>> response = propertyRepository.getSliderProperties(request);
        response.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleSliderResults);


        isLoading.setValue(false);
    }

    public void getProperties(ILeadRequest<PropertyRequest> request) {
        isLoading.setValue(true);

        Observable<ILeadResponse<Property>> response = propertyRepository.getProperties(request);
        response.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handlePropertiesResults);


        isLoading.setValue(false);
    }
}