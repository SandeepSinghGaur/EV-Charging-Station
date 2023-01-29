package com.chargingStation.service;

import com.chargingStation.entity.EvStation;
import com.chargingStation.payload.request.StationDetails;
import com.chargingStation.repository.EvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EvStationServiceImpl implements EvStationService {
    @Autowired
    EvRepository evRepository;
    public boolean addStationDetail(StationDetails stationDetails) {
        EvStation evStation = new EvStation();
        if(Objects.nonNull(stationDetails)){
            evStation.setStationId(stationDetails.getStationId());
            evStation.setStationImage(stationDetails.getStationName());
            evStation.setStationImage(stationDetails.getStationImage());
            evStation.setStationPricing(stationDetails.getStationPricing());
            evStation.setStationAddress(stationDetails.getStationAddress());
        }
        if(Objects.nonNull(evStation)){
            evRepository.save(evStation);
            return true;
        }
        return false;
    }
}
