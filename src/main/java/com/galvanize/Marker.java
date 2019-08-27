package com.galvanize;

public class Marker {
    public boolean isCap() {
        return cap;
    }

    public void setCap(boolean cap) {
        this.cap = cap;
    }

    public float getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(float inkLevel) {
        this.inkLevel = inkLevel;
    }

    private float inkLevel = 1.0f;
    private boolean cap = true;

    void cap(){
        cap = true;
    }

    void unCap(){
        cap = false;
    }

    void write(String letters){
        inkLevel -= letters.length() * 0.05f;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "cap='" + cap + '\'' +
                ", ink='" + inkLevel + '\'' +
                '}';
    }
}
