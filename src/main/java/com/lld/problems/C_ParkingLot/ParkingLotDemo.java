package com.lld.problems.C_ParkingLot;

import com.lld.problems.C_ParkingLot.entities.vehicletype.Car;
import com.lld.problems.C_ParkingLot.entities.vehicletype.Motorcycle;
import com.lld.problems.C_ParkingLot.entities.vehicletype.Truck;
import com.lld.problems.C_ParkingLot.entities.vehicletype.Vehicle;
import com.lld.problems.C_ParkingLot.services.Level;
import com.lld.problems.C_ParkingLot.services.ParkingLot;

public class ParkingLotDemo {

    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2, 80));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ123");
        Vehicle motorcycle = new Motorcycle("M1234");

        // Park Vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display Availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
}
