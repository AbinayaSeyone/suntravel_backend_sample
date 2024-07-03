package com.reservationSystem.SunTravel.entity;

import lombok.Data;

@Data
public class RoomTypeCondition {
    private String roomTypeName;
    private int noOfAdults;
    private long noOfRooms;
}
