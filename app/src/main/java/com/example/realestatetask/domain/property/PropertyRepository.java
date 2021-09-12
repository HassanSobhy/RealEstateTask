package com.example.realestatetask.domain.property;

import com.example.realestatetask.data.source.remote.ilead.ILeadRequest;
import com.example.realestatetask.data.source.remote.ilead.ILeadResponse;
import com.example.realestatetask.domain.property.entity.Property;
import com.example.realestatetask.domain.property.request.PropertyRequest;

import io.reactivex.Observable;

public interface PropertyRepository {

    Observable<ILeadResponse<Property>> getSliderProperties(ILeadRequest<PropertyRequest> request);

    Observable<ILeadResponse<Property>> getProperties(ILeadRequest<PropertyRequest> request);
}