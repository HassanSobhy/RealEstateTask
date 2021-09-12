package com.example.realestatetask.data.source.remote.ilead.api;

import com.example.realestatetask.data.source.remote.ilead.ILeadRequest;
import com.example.realestatetask.data.source.remote.ilead.ILeadResponse;
import com.example.realestatetask.domain.property.entity.Property;
import com.example.realestatetask.domain.property.request.PropertyRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PropertyAPI {

    @POST("Property/SliderImagesProperty")
    Call<ILeadResponse<Property>> getSliderProperties(@Body ILeadRequest<PropertyRequest> request);

    @POST("Property/PropertyList")
    Call<ILeadResponse<Property>> getProperties(@Body ILeadRequest<PropertyRequest> request);
}