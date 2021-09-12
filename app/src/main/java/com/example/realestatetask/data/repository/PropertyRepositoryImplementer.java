package com.example.realestatetask.data.repository;

import com.example.realestatetask.data.source.remote.ilead.ILeadRequest;
import com.example.realestatetask.data.source.remote.ilead.ILeadResponse;
import com.example.realestatetask.data.source.remote.ilead.api.PropertyAPI;
import com.example.realestatetask.domain.property.PropertyRepository;
import com.example.realestatetask.domain.property.entity.Property;
import com.example.realestatetask.domain.property.request.PropertyRequest;

import io.reactivex.Observable;
import retrofit2.Call;

public class PropertyRepositoryImplementer implements PropertyRepository {

    private final PropertyAPI remote;

    public PropertyRepositoryImplementer(PropertyAPI remote) {
        this.remote = remote;
    }

    @Override
    public Observable<ILeadResponse<Property>> getSliderProperties(ILeadRequest<PropertyRequest> request) {
        return remote.getSliderProperties(request);
    }

    @Override
    public Observable<ILeadResponse<Property>> getProperties(ILeadRequest<PropertyRequest> request) {
        return remote.getProperties(request);
    }
}