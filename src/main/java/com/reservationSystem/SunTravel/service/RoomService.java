package com.reservationSystem.SunTravel.service;

import com.reservationSystem.SunTravel.entity.Contract;
import com.reservationSystem.SunTravel.entity.Room;

import java.util.List;

public interface RoomService
{

    public Room addRoom( Room room );

   public List<Room> fetchRoomList();

   public Room fetchServiceById( Long roomId );

   public List<Object[]> fetchAvailableRoomsByRoomTypeAndNoOfAdultsAndNoOfRooms( String roomType, int noOfAdults, long noOfRooms );
}
