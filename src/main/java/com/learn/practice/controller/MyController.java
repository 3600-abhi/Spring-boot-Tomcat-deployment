package com.learn.practice.controller;

import com.learn.practice.dto.BookingStatusRequestDto;
import com.learn.practice.services.MyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping("/getBookingStatus")
    public ResponseEntity<Object> getBookingStatus(@RequestBody BookingStatusRequestDto bookingStatusRequestDto) {
        return new ResponseEntity<>(myService.getBookingStatus(bookingStatusRequestDto), HttpStatus.OK);
    }
}
