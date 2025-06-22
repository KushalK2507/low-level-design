# Designing a Parking Lot System


## Entities:
1. Vehicle class is an abstract base class for different types of vehicles. It is extended by Car, Motorcycle, and Truck classes. 
2. VehicleType enum defines the different types of vehicles supported by the parking lot.
3. ParkingSpot class represents an individual parking spot and tracks the availability and the parked vehicle.
## Services:
4. ParkingLot class follows the Singleton pattern to ensure only one instance of the parking lot exists. It maintains a list of levels and provides methods to park and unpark vehicles.
5. Level class represents a level in the parking lot and contains a list of parking spots. It handles parking and un-parking of vehicles within the level.
6. Multi-threading is achieved through the use of synchronized keyword on critical sections to ensure thread safety.
## Test Class:
7. The Main class demonstrates the usage of the parking lot system.