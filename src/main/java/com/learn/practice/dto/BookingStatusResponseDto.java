package com.learn.practice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookingStatusResponseDto {
    private String bookingStatus;
    private String fromCity;
    private String toCity;
    private String seatNo;
    private String departureTime;
    private String destinationTime;
}
