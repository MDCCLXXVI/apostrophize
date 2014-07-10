package com.ephemeral;

/**
 * Created by MDCCLXXVI on 7/9/14.
 */
public class Counter {

    protected int marker = 0;

    public void setMarker(int marker) {
        this.marker = marker;
    }

    public int getMarker() {
        return marker;
    }

    public Counter() {
    }

    public void increment(){
       marker++;
    }
}
