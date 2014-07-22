package com.who;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */
public class Person {

    public Person(String y, String x, int year){
        lName = y;
        fName = x;
        this.year = year;
    }

    @Override
    public String toString(){
        return String.format("%s[name=%s][year=%d]",getClass().getName(),getName(),getYear());
    }

    private String fName, lName, name;
    private int year;

    public String getName() {
        return String.format("%s, %s", lName, fName);
    }

    public int getYear() {
        return year;
    }
}
