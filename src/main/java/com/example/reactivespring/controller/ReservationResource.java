package com.example.reactivespring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(ReservationResource.ROOM_V_1_RESERVATION)
@CrossOrigin
public class ReservationResource {
    public static final String ROOM_V_1_RESERVATION = "/room/v1/reservation/";

    @GetMapping(path = "{roomId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<String> getReservationById(@PathVariable String roomId){
        // * TODO: add service
        // reservationService.getReservation(roomId);
        return Mono.just("{}");
    }
}