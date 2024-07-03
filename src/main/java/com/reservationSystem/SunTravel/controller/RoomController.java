package com.reservationSystem.SunTravel.controller;

import com.reservationSystem.SunTravel.entity.Contract;
import com.reservationSystem.SunTravel.entity.Room;
import com.reservationSystem.SunTravel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController
{
    @Autowired
    private RoomService roomService;
    @PostMapping("/roomsAdd")
    public Room addRoom( @RequestBody Room room ) {
        return roomService.addRoom(room);
    }
    @GetMapping("/rooms")
    public List<Room> fetchRoomList(){
        return roomService.fetchRoomList();
    }

    @GetMapping("/rooms/{id}")
    public Room fetchRoomById(@PathVariable("id") Long roomId)
    {
        return roomService.fetchServiceById(roomId);
    }

    @GetMapping("/availableRooms")
    public List<Object[]> findAvailableRoomsTesting(@RequestParam String roomType,
                                             @RequestParam int noOfAdults,
                                             @RequestParam long noOfRooms) {
        return roomService.fetchAvailableRoomsByRoomTypeAndNoOfAdultsAndNoOfRooms(roomType,noOfAdults,noOfRooms);
    }


}
