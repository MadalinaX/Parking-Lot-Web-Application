package com.parking.parkinglot.common;

public class CarDto {
    Long id;
    private String licensePLate;
    private String parkingSpot;
    String ownerName;

    public CarDto(Long id, String licensePLate, String parkingSpot, String ownerName) {
        this.id = id;
        this.licensePLate = licensePLate;
        this.parkingSpot = parkingSpot;
        this.ownerName = ownerName;
    }

    public Long getId() {
        return id;
    }

    public String getLicensePLate() {
        return licensePLate;
    }

    public String getParkingSpot() {
        return parkingSpot;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
