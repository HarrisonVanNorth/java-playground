package com.galvanize;

public class Marker {

    private float inkLevel;
    private boolean cap;
    private String color;

    public Marker (boolean cap, float inkLevel, String color){
        this.cap = cap;
        this.inkLevel = inkLevel;
        this.color = color;
    }

    public void isCapped(){
        cap = true;
    }
    public void unCap(){
        cap = false;
    }
    public void changeColor( String letters ){
        this.color = letters;
    }

    public void write(String letters){
        inkLevel -= letters.length() * 0.05f;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "cap='" + cap + '\'' +
                ", ink='" + inkLevel + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
