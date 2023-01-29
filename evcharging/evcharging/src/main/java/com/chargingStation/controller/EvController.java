package com.chargingStation.controller;

import com.chargingStation.payload.request.StationDetails;
import com.chargingStation.service.EvStationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EvController {
    @Autowired
    private EvStationServiceImpl evStationService;

    @PostMapping("/evStation/info")
    public boolean registerStation(@RequestBody StationDetails stationDetails){
        return evStationService.addStationDetail(stationDetails);
    }
    @GetMapping("/city")
    public List<StationDetails> getStation(String cityName) {
        return evStationService.getStaionDetail(cityName);
    }
}
