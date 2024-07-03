package com.reservationSystem.SunTravel.service;

import com.reservationSystem.SunTravel.entity.Contract;
import com.reservationSystem.SunTravel.entity.Hotel;
import com.reservationSystem.SunTravel.entity.RoomType;
import com.reservationSystem.SunTravel.repository.HotelRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith( MockitoExtension.class )
class HotelServiceImplementationTest
{
    @InjectMocks
    private HotelServiceImplementation hotelServiceImplementation;
    @Mock
    private HotelRepository hotelRepository;

    @Test
    void addHotel()
    {
        List<Contract> contractList=new ArrayList<>();
        List<RoomType> roomTypeList=new ArrayList<>();

        Hotel newHotel=new Hotel();
        newHotel.setHotelId( 1L );
        newHotel.setHotelName( "Jetwing" );
        newHotel.setHotelLocation( "Jaffna" );

        newHotel.setContracts( contractList );
        newHotel.setRoomTypes( roomTypeList );

//        when( newHotel.setImageUrl(setHotelImageUrl())).thenReturn( "" );
        when(hotelRepository.save( newHotel )).thenReturn(new Hotel());
        Hotel savedHotel=hotelServiceImplementation.addHotel( newHotel );
        assertEquals( savedHotel,new Hotel() );
    }

    @Test
    void fetchHotelList()
    {
    }

    @Test
    void fetchHotelById()
    {
    }

    @Test
    void deleteHotelById()
    {
    }

    @Test
    void updateHotel()
    {
    }

    @Test
    void fetchHotelByName()
    {
    }
}