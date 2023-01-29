package com.chargingStation.service;

import com.chargingStation.payload.request.StationDetails;

public interface EvStationService {

    public boolean addStationDetail(StationDetails stationDetails);
}
