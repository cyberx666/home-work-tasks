package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "a, b";
 //       if(-a>-b){
        if (Math.abs(a)> Math.abs(b)){
            return "The number" + " " + a +" " + "has the greatest magnitude!" ;
        }
        if(Math.abs(b) > Math.abs(a)){
            return "The number" + " " + b +" " + "has the greatest magnitude!";

        }
        else if(Math.abs(b) == Math.abs(a)){
            return "The number" +" " + a +" " +"and" +" " + b +" " +"are equals by magnitude!";
        }

        return result;
    }
}
