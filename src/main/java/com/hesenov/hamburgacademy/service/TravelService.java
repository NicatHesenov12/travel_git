package com.hesenov.hamburgacademy.service;

import com.hesenov.hamburgacademy.dto.request.TravelRequest;
import com.hesenov.hamburgacademy.dto.response.TravelResponse;
import com.hesenov.hamburgacademy.entity.Travel;
import com.hesenov.hamburgacademy.mapper.MapperTravel;
import com.hesenov.hamburgacademy.repository.TravelRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {
    @Autowired
    private TravelRepository travelJpa;

    @Qualifier("mapperTravelImpl")
    @Autowired
    MapperTravel travelMapper;

    @Transactional
    public void addTravel(TravelRequest travelRequest) {
        Travel travel = travelMapper.requestToEntity(travelRequest);
        travelJpa.save(travel);
    }

    @Transactional
    public List<TravelResponse> travelResponses(){
        List<Travel> list=travelJpa.findAll();
        return travelMapper.entityToResponseList(list);
    }

    @Transactional
    public void delete (Long id){
        travelJpa.deleteById(id);
    }
}
