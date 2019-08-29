package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarkerTest {
    @Test
    public void markerNew(){
        Marker marker = new Marker(true, (float) 1.0, "blue");
        String result = marker.toString();
        assertEquals("Marker{cap='true', ink='1.0', color='blue'}", result);

    }
}
