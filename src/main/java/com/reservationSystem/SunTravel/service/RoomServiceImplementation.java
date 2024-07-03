package com.reservationSystem.SunTravel.service;

import com.reservationSystem.SunTravel.entity.Room;
import com.reservationSystem.SunTravel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImplementation implements RoomService
{
    @Autowired
    private RoomRepository roomRepository;
    @Override
    public Room addRoom( Room room )
    {
        return roomRepository.save( room );
    }

    @Override
    public List<Room> fetchRoomList()
    {
        return roomRepository.findAll();
    }

    @Override
    public Room fetchServiceById( Long roomId )
    {
        return roomRepository.findById( roomId ).get();
    }

    @Override
    public List<Object[]> fetchAvailableRoomsByRoomTypeAndNoOfAdultsAndNoOfRooms( String roomType, int noOfAdults, long noOfRooms )
    {
        return roomRepository.findHotelRoomCountByTypeAndAdults(roomType,noOfAdults,noOfRooms);
    }
}
