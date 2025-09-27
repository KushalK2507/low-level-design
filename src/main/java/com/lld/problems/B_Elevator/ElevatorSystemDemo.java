package com.lld.problems.B_Elevator;

import com.lld.problems.B_Elevator.controller.ElevatorController;

public class ElevatorSystemDemo {
    public static void main(String[] args) {
        ElevatorController controller = new ElevatorController(3 , 5);
        controller.requestElevator(5, 10);
        controller.requestElevator(3, 7);
        controller.requestElevator(8, 2);
        controller.requestElevator(1, 9);
    }
}
