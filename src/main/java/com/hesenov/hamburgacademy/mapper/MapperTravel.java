package com.hesenov.hamburgacademy.mapper;

import com.hesenov.hamburgacademy.dto.request.TravelRequest;
import com.hesenov.hamburgacademy.dto.response.TravelResponse;
import com.hesenov.hamburgacademy.entity.Travel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MapperTravel {


    TravelResponse entityToResponse(Travel travel);


    Travel requestToEntity(TravelRequest travelRequest);

    List<TravelResponse> entityToResponseList(List<Travel> travel);
}
