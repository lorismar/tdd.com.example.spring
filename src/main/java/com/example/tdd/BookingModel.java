package com.example.tdd;

import java.time.LocalDate;

public class BookingModel {

    private String id;
    private String reserveName;
    private LocalDate checkIn;
    private LocalDate ckeckOut;
    private int numbeGuests;


    public BookingModel(String id, String reserveName, LocalDate checkIn, LocalDate ckeckOut, int numbeGuests) {
        this.id = id;
        this.reserveName = reserveName;
        this.checkIn = checkIn;
        this.ckeckOut = ckeckOut;
        this.numbeGuests = numbeGuests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCkeckOut() {
        return ckeckOut;
    }

    public void setCkeckOut(LocalDate ckeckOut) {
        this.ckeckOut = ckeckOut;
    }

    public int getNumbeGuests() {
        return numbeGuests;
    }

    public void setNumbeGuests(int numbeGuests) {
        this.numbeGuests = numbeGuests;
    }
}
