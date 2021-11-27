package com.hotel.hotelservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

    @GetMapping
    public ResponseEntity<String> getHotel(){

        return  ResponseEntity.ok("Hi Hotel");
    }
}
