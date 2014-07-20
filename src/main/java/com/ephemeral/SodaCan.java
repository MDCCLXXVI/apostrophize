package com.ephemeral;

/**
 * Created by MDCCLXXVI on 7/19/14.
 */

interface Measurable{
    double getMeasure();
}
public class SodaCan implements Measurable{
    SodaCan(double h, double r){
        this.height = h;
        this.radius = r;

    }

    private double height, radius;

    double getSurfaceArea(){
        return Math.PI * height * radius * 2;
    }

    double getVolume(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getMeasure() {
        return Math.PI * height * radius * 2;
    }

    public double average(Measurable[] arr){

        if(arr.length ==0){return  0;}

        double sum =0;
        for(Measurable object:arr){
            sum += object.getMeasure();
        }
        return sum / arr.length;

    }


}
