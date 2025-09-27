package com.lld.problems.B_Elevator.entities;

import lombok.Getter;

@Getter
public class Request {
    private final int sourceFloor;
    private final int destinationFloor;
    public Request(int sourceFloor, int destinationFloor) {
        this.sourceFloor = sourceFloor;
        this.destinationFloor = destinationFloor;
    }
}
