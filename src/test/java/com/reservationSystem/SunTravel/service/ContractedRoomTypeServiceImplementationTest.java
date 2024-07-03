package com.reservationSystem.SunTravel.service;

import com.reservationSystem.SunTravel.entity.Contract;
import com.reservationSystem.SunTravel.entity.ContractedRoomType;
import com.reservationSystem.SunTravel.entity.Hotel;
import com.reservationSystem.SunTravel.entity.RoomType;
import com.reservationSystem.SunTravel.repository.ContractedRoomTypeRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith( MockitoExtension.class )
class ContractedRoomTypeServiceImplementationTest
{

    @Mock
    private ContractedRoomTypeRepository contractedRoomTypeRepository;
    @InjectMocks
    private ContractedRoomTypeServiceImplementation contractedRoomTypeServiceImplementation;



    @Test
    void canFetchContractedRoomTypeList()
    {
        ContractedRoomType contractedRoomType=new ContractedRoomType();
        List<ContractedRoomType> contractedRoomTypeList=new ArrayList<>();
        contractedRoomTypeList.add( contractedRoomType );
        when(contractedRoomTypeRepository.findAll()).thenReturn( contractedRoomTypeList );
        List<ContractedRoomType> savedContractedRoomTypeList=contractedRoomTypeServiceImplementation.fetchContractedRoomTypeList();
        assertEquals( contractedRoomTypeList,savedContractedRoomTypeList);
//        verify(contractedRoomTypeRepository).findAll();
    }

    @Test
    @Disabled
    void addContractedRoomType()
    {
//        Hotel newHotel=new Hotel("Jetwing","Jaffna");
//        Contract newContract=new Contract(12/01/2024,12/02/2025,15,newHotel);
//        ContractedRoomType contractedRoomType=new ContractedRoomType(
//                1000,3,2
//                ,new Contract(12/01/2024,12/01/2025,15
//
//                ,new RoomType("") )
    }

    @Test
    @Disabled
    void saveContractedRoomTypes()
    {
    }

    @Test
    @Disabled
    void filterAndGroupContracts()
    {
    }
}