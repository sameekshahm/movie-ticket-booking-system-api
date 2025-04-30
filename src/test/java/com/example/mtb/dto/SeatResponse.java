package com.example.mtb.dto;

import lombok.Builder;

import java.util.List;
import java.util.Map;

@Builder
public record SeatResponse (
        String seatId,
        String name
)
{}