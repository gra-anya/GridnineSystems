package com.gridnine.testing.filter;

import com.gridnine.testing.Flight;
import com.gridnine.testing.FlightBuilder;
import com.gridnine.testing.Segment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FilterHoursOnLandTest {


    @Test
    void filter() {
        //given
        LocalDateTime ldtNow = LocalDateTime.now();
        int hoursOnLand = 3;
        Flight flightWithThreeHoursOnLand = new Flight(Arrays.asList(
                new Segment(ldtNow, ldtNow.plusHours(2))
                , new Segment(ldtNow.plusHours(6), ldtNow.plusHours(7))));
        Flight flightWithoutThreeHoursOnLand = new Flight(Arrays.asList(
                new Segment(ldtNow, ldtNow.plusHours(2))
                , new Segment(ldtNow.plusHours(3), ldtNow.plusHours(7))));

        List<Flight> flights = Arrays.asList(flightWithThreeHoursOnLand, flightWithoutThreeHoursOnLand);

        //then
        FilterFlights filterFlights = new FilterHoursOnLand(hoursOnLand);
        List<Flight> flightsResult = filterFlights.filter(flights);

        List<Flight> flightsExpected = List.of(flightWithoutThreeHoursOnLand);
        //when
        Assertions.assertEquals(flightsExpected, flightsResult);
    }
}