package com.lld.problems.C_ParkingLot.entities.vehicletype;

public abstract class Vehicle {
    protected String numberPlate;
    protected VehicleType vehicleType;

    public Vehicle(String numberPlate, VehicleType vehicleType) {
        this.numberPlate = numberPlate;
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
