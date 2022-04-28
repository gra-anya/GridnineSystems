package com.gridnine.testing.filter;

import com.gridnine.testing.Flight;

import java.util.List;
import java.util.function.Predicate;

@FunctionalInterface
public interface FilterFlights{
    List<Flight> filter(List<Flight> flights);
}
