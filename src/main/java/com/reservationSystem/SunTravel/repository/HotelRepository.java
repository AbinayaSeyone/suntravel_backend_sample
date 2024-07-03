package com.reservationSystem.SunTravel.repository;

import com.reservationSystem.SunTravel.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long>
{
    List<Hotel> findByHotelNameIgnoreCase( String hotelName );
}