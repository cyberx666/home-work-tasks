package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class BelongsToIntervalChecker {

    @Step
    public String checkNumberInInterval(int from, int to, int number) {

        String result ="";
        if(number>=from && number<= to){
            return "Number" +" " + number+" "+"belong to interval" +" "+"["+ from+";"+to+"]";
        }
        if(number<=from){
            return "Number"+" " + number +" " +"not belong to interval" +" "+"["+ from+";"+to+"]";
        }
        if(number>= to){
            return "Number"+" " + number +" " +"not belong to interval" +" "+"["+ from+";"+to+"]";
        }

        return result;
    }
}