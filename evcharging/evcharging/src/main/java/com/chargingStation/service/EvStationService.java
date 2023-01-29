package com.chargingStation.service;

import com.chargingStation.payload.request.StationDetails;

import java.util.List;

public interface EvStationService {

    public boolean addStationDetail(StationDetails stationDetails);
    public List<StationDetails> getStaionDetail(String cityName);
}
