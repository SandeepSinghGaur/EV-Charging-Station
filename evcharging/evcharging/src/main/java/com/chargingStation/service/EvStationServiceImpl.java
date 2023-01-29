package com.chargingStation.service;

import com.chargingStation.entity.EvStation;
import com.chargingStation.payload.request.StationDetails;
import com.chargingStation.repository.EvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Service
public class EvStationServiceImpl implements EvStationService {
    @Autowired
    EvRepository evRepository;
    public boolean addStationDetail(StationDetails stationDetails) {
        EvStation evStation = new EvStation();
        try {
            if(Objects.nonNull(stationDetails)){
                if(evRepository.existsByStationName(stationDetails.getStationName())==false){
                    evStation.setStationId(stationDetails.getStationId());
                    evStation.setStationName(stationDetails.getStationName());
                    evStation.setStationImage(stationDetails.getStationImage());
                    evStation.setStationPricing(stationDetails.getStationPricing());
                    evStation.setStationAddress(stationDetails.getStationAddress());
                    evRepository.save(evStation);
                    return true;
                }else{
                    Logger.getLogger("Station already exits in database");
                }

            }
            if(Objects.isNull(evStation)){
                Logger.getLogger("Send Data properly");
                return false;
            }
        }catch (Exception exception){
            Logger.getLogger("Station already exits in database"+" "+exception.getMessage());
        }
        return false;
    }

    public List<StationDetails> getStaionDetail(String cityName) {
        ArrayList<StationDetails> detail = new ArrayList<>();
        StationDetails stationDetaisUsingCity=evRepository.findByStationAddress(cityName);
        detail.add(stationDetaisUsingCity);
        return detail;
    }
}
