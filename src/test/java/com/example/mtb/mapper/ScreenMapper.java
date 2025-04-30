package com.example.mtb.mapper;

import com.example.mtb.dto.ScreenResponse;
import com.example.mtb.dto.SeatResponse;
import com.example.mtb.entity.Screen;
import com.example.mtb.entity.Seat;
import org.springframework.stereotype.Component;


import java.util.LinkedList;
import java.util.List;

@Component
public class ScreenMapper {

    public ScreenResponse screenResponseMapper(Screen screen) {
        if (screen == null)
            return null;
        return new ScreenResponse(
                screen.getScreenId(),
                screen.getScreenType(),
                screen.getCapacity(),
                screen.getNoOfRows(),
                seatResponseMapper(screen.getSeats())

        );
    }

    private List<SeatResponse> seatResponseMapper(List<Seat> seats) {
        List<SeatResponse> seatList = new LinkedList<>();
        for (Seat seat : seats) {

            seatList.add(SeatResponse.builder()
                    .seatId(seat.getSeatId())
                    .name(seat.getName())
                    .build());
        }
        return seatList;



    }
}