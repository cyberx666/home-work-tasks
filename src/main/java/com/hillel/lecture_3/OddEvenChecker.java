package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class OddEvenChecker {

    @Step
    public String checkNumber(int number) {

//        TODO implements result
        String result = "number";
        if(number%2==0){
            return "Even Number";
        }
        if (number%2!=0){
            return ("Odd Number");
        }

        System.out.println("Bye");

        return result;
    }
}
