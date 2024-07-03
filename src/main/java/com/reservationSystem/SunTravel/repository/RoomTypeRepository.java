package com.reservationSystem.SunTravel.repository;

import com.reservationSystem.SunTravel.entity.Hotel;
import com.reservationSystem.SunTravel.entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Long> {
    List<RoomType> findByRoomTypeNameIgnoreCaseAndMaxAdultsGreaterThanEqualAndNoOfRoomsGreaterThanEqual(
            String roomTypeName,
            int noOfAdults,
            long noOfRooms
    );
}
