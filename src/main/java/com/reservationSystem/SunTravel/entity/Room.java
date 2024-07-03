package com.reservationSystem.SunTravel.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Room
{
    @Id
    @SequenceGenerator(
            name="room_sequence",
            sequenceName = "room_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "room_sequence"
    )
    private Long roomId;
    private Long price;
    private int max_Adults;
    private String room_type;
    private Boolean status;

    @ManyToOne(
            optional = false
    )
    @JoinColumn(
            name="hotelId",
            nullable = false
            //referencedColumnName = "hotelId"
    )
    private Hotel hotel;
}
