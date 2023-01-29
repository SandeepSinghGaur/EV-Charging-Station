package com.chargingStation.payload.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class StationDetails {
    private Long stationId;
    private String stationName;
    private String stationImage;
    private String stationPricing;
    private String stationAddress;
}
