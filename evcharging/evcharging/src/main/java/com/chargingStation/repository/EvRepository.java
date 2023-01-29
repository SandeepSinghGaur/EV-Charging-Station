package com.chargingStation.repository;

import com.chargingStation.entity.EvStation;
import com.chargingStation.payload.request.StationDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvRepository extends JpaRepository<EvStation,Long> {
    public Boolean existsByStationName(String stationName);
    public StationDetails findByStationAddress(String city);

}
