package com.example.realestatetask.domain.property;

import com.example.realestatetask.data.source.remote.ilead.ILeadRequest;
import com.example.realestatetask.data.source.remote.ilead.ILeadResponse;
import com.example.realestatetask.domain.property.entity.Property;
import com.example.realestatetask.domain.property.request.PropertyRequest;

import io.reactivex.Observable;
import io.reactivex.Single;

public interface PropertyRepository {

    Single<ILeadResponse<Property>> getSliderProperties(ILeadRequest<PropertyRequest> request);

    Single<ILeadResponse<Property>> getProperties(ILeadRequest<PropertyRequest> request);
}