# Designing an Elevator System

## Classes, Interfaces and Enumerations

### Entities:
1. Direction enum represents the possible directions of elevator movement (UP or DOWN). 
2. Request class represents a user request for an elevator, containing the source floor and destination floor.
### Services:
3. Elevator class represents an individual elevator in the system. It has a capacity limit and maintains a list of 4. requests. The elevator processes requests concurrently and moves between floors based on the requests.
### Controller Class:
4. ElevatorController class manages multiple elevators and handles user requests. It finds the optimal elevator to serve a request based on the proximity of the elevators to the requested floor.
### Test Class:
5. ElevatorSystem class is the entry point of the application and demonstrates the usage of the elevator system.