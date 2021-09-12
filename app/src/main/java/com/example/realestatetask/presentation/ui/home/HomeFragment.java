package com.example.realestatetask.presentation.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.realestatetask.data.repository.PropertyRepositoryImplementer;
import com.example.realestatetask.data.source.remote.ilead.ILeadRequest;
import com.example.realestatetask.data.source.remote.ilead.RetrofitBuilder;
import com.example.realestatetask.data.source.remote.ilead.api.PropertyAPI;
import com.example.realestatetask.databinding.HomeFragmentBinding;
import com.example.realestatetask.domain.property.PropertyRepository;
import com.example.realestatetask.domain.property.request.PropertyRequest;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    HomeViewModel viewModel;
    HomeFragmentBinding binding;

    PropertyAdapter propertySliderAdapter;
    PropertyAdapter propertyAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = HomeFragmentBinding.inflate(inflater, container, false);

        init();
        observe();

        return binding.getRoot();
    }

    private void init() {
        initViewModel();
        initPropertiesSliderViewPager();
        initPropertiesRecycler();

        viewModel.getSliderProperties(getRequest());
        viewModel.getProperties(getRequest());
    }

    private ILeadRequest<PropertyRequest> getRequest() {
        PropertyRequest propertyRequest = getPropertyRequest();
        return getPropertyRequestILeadRequest(propertyRequest);
    }

    @NonNull
    private ILeadRequest<PropertyRequest> getPropertyRequestILeadRequest(PropertyRequest propertyRequest) {
        ILeadRequest<PropertyRequest> request = new ILeadRequest<>();
        request.setAppLanguage("en");
        request.setDeviceSerial("EE1F55CE-18DA-4707-983D-E5B8AFCE1825");
        request.setMeasureUnitId(2);
        request.setAppVersion("");
        request.setNotificationToken("emfsLB2jaEXwhxtS-w1t3z:APA91bEenrpoS6J8VKrAtxrdpxQZFXong7ftVpuyEntgWmt84QCRQVdPp1ANV75fTBTE8o3-AqR0Zb7LrLAqb5znNrsDsbJ4yTqr6YGbTjEc7444Ruz0cmmnnq13ugeISPL2xHPfHMac");
        request.setDeviceType(1);
        request.setUserId(0);
        request.setData(propertyRequest);
        request.setIp("");
        request.setCountryId(0);
        request.setCountryId(65946);
        request.setOsVersion("");
        return request;
    }

    @NonNull
    private PropertyRequest getPropertyRequest() {
        PropertyRequest propertyRequest = new PropertyRequest();
        propertyRequest.setPropertyFurnishingId(-1);
        propertyRequest.setMinBathRoom(-1);
        propertyRequest.setIsRented(-1);
        propertyRequest.setKeyword("");
        propertyRequest.setMinPrice(-1);
        propertyRequest.setMinArea(-1);
        propertyRequest.setPropId(-1);
        propertyRequest.setAreaId(-1);
        propertyRequest.setCountryId(65946);
        propertyRequest.setCategoryName("");
        propertyRequest.setCityName("");
        propertyRequest.setPropertyAdOnsDtos(new ArrayList<Object>());
        propertyRequest.setIsRentedName("");
        propertyRequest.setPropertyTypeName("");
        propertyRequest.setMaxArea(-1);
        propertyRequest.setIsFeature(false);
        propertyRequest.setMaxBathRoom(-1);
        propertyRequest.setMinBedRoom(-1);
        propertyRequest.setMaxPrice(-1);
        propertyRequest.setCategoryId(-1);
        propertyRequest.setFurnishedName("");
        propertyRequest.setPropertyTypeId(1);
        propertyRequest.setSortTypeId(-1);
        propertyRequest.setMaxBedRoom(-1);
        propertyRequest.setPropertyCity(new ArrayList<Object>());
        return propertyRequest;
    }

    private void initViewModel() {
        PropertyAPI propertyAPI = RetrofitBuilder.getInstance().create(PropertyAPI.class);
        PropertyRepository propertyRepository = new PropertyRepositoryImplementer(propertyAPI);
        HomeViewModelFactory factory = new HomeViewModelFactory(propertyRepository);
        viewModel = new ViewModelProvider(this, factory).get(HomeViewModel.class);
    }

    private void initPropertiesSliderViewPager() {
        propertySliderAdapter = new PropertyAdapter(PropertyAdapter.PropertyViewType.SLIDER);
        binding.vpProperties.setAdapter(propertySliderAdapter);


        binding.vpProperties.setClipToPadding(false);
        binding.vpProperties.setClipChildren(false);
        binding.vpProperties.setOffscreenPageLimit(3);
        binding.vpProperties.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r = 1 - Math.abs(position);
                page.setScaleY(r * 0.15f + 0.85f);
            }
        });

        binding.vpProperties.setPageTransformer(compositePageTransformer);

    }

    private void initPropertiesRecycler() {
        propertyAdapter = new PropertyAdapter(PropertyAdapter.PropertyViewType.NORMAL);
        binding.rvProperties.setAdapter(propertyAdapter);
    }

    private void observe() {

        viewModel.isLoading.observe(getViewLifecycleOwner(), isLoading -> {
            if (isLoading) {
                binding.pbHome.setVisibility(View.VISIBLE);
            } else if (!isLoading) {
                binding.pbHome.setVisibility(View.INVISIBLE);
            }
        });
        viewModel.sliderProperties.observe(getViewLifecycleOwner(), properties -> {
            propertySliderAdapter.submitList(properties);
        });

        viewModel.properties.observe(getViewLifecycleOwner(), properties -> {
            propertyAdapter.submitList(properties);
        });

        viewModel.error.observe(getViewLifecycleOwner(), error -> {
            Toast.makeText(getContext(), error, Toast.LENGTH_LONG).show();
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}