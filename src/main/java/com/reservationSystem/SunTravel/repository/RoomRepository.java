package com.reservationSystem.SunTravel.repository;

import com.reservationSystem.SunTravel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long>
{
    @Query("SELECT r.hotel.hotelId, r.hotel.hotelName, COUNT(r) " +
                   "FROM Room r " +
                   "WHERE r.room_type = :roomType " +
                   "AND r.max_Adults >= :noOfAdults " +
                   "GROUP BY r.hotel.hotelId " +
                   "HAVING COUNT(r) >= :noOfRooms")
    public List<Object[]> findHotelRoomCountByTypeAndAdults(     @Param("roomType") String roomType,
                                                      @Param("noOfAdults") int noOfAdults,
                                                      @Param("noOfRooms") long noOfRooms);
}
