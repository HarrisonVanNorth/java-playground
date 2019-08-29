package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EchoTest {
    @Test
    public void testShoutReturnUpperCase(){
        //setup
        Echo echo = new Echo();
        //excisions
        String result = echo.shout("hello");
        //assertion
        assertEquals("HELLO", result);
    }
}
