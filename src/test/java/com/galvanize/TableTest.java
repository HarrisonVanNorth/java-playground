package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TableTest {
    @Test
    public void tableSetShape() {
        Table table = new Table();
        String result = table.setShape("Round");
        assertEquals("Round", result);
    }
    @Test
    public void tableToString(){
        Table table = new Table();
        table.setShape("round");
        String result = table.toString();
        assertEquals("Table{shape= round}",result);
    }

}
