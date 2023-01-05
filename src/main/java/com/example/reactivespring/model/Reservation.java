package com.example.reactivespring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Document
public class Reservation {
    @Id
    private String id;
    private Long roomNumber;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkIn;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkOut;
    private Integer price;

    public Reservation() { }

    public Reservation(Long roomNumer, LocalDate checkIn, LocalDate checkOut, Integer price) {
        this.roomNumber = roomNumer;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public Long getRoomNumer() {
        return roomNumber;
    }

    public void setRoomNumer(Long roomNumer) {
        this.roomNumber = roomNumer;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
