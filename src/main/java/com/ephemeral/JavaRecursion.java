package com.ephemeral;

/**
 * Created by MDCCLXXVI on 6/13/14.
 */
public class JavaRecursion {

    int getTriNumber(int num){
        if(num ==1){
            return 1;
        }
        else{
            return num + getTriNumber(num-1);
        }

    }

    int factorial(int num){
        if(num == 1)
            return 1;
        else{
            return num * factorial(num - 1);
        }
    }


}
