package com.hesenov.hamburgacademy.controller;

import com.hesenov.hamburgacademy.dto.request.TravelRequest;
import com.hesenov.hamburgacademy.dto.response.TravelResponse;
import com.hesenov.hamburgacademy.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TravelController {
    @Autowired
    TravelService travelService;

    @PostMapping("/addTravel")
    public void addTravel(@RequestBody TravelRequest travelRequest) {
        travelService.addTravel(travelRequest);
    }

    @GetMapping
    public List<TravelResponse> travelResponses(){
        return travelService.travelResponses();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteId(@PathVariable Long id){
    travelService.delete(id);
        }
}
