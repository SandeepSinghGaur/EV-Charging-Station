package com.chargingStation.repository;

import com.chargingStation.entity.EvStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvRepository extends JpaRepository<EvStation,Long> {
}
