package com.example.realestatetask.domain.property;

import com.example.realestatetask.data.source.remote.ilead.ILeadRequest;
import com.example.realestatetask.data.source.remote.ilead.ILeadResponse;
import com.example.realestatetask.domain.property.entity.Property;
import com.example.realestatetask.domain.property.request.PropertyRequest;

import retrofit2.Call;

public interface PropertyRepository {

    Call<ILeadResponse<Property>> getSliderProperties(ILeadRequest<PropertyRequest> request);

    Call<ILeadResponse<Property>> getProperties(ILeadRequest<PropertyRequest> request);
}