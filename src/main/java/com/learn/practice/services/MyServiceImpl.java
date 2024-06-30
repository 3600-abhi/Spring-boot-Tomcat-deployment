package com.learn.practice.services;

import com.learn.practice.dto.BookingStatusRequestDto;
import com.learn.practice.dto.BookingStatusResponseDto;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService{
    @Override
    public Object getBookingStatus(BookingStatusRequestDto bookingStatusRequestDto) {
        return BookingStatusResponseDto.builder()
                .bookingStatus("confirm")
                .fromCity("Mumbai")
                .toCity("Lucknow")
                .departureTime("22-06-2024 11:15:00")
                .destinationTime("22-06-2024 11:15:00")
                .seatNo("7F")
                .build();
    }
}
