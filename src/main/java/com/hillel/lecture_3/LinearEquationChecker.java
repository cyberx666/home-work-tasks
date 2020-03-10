package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class LinearEquationChecker {

    @Step
    public int linearEquation(int a, int b){

//        TODO implements result
        int result = a;
        if (a > 0) {
            return (0 - b) / a;
        }
        if (a == 0){
            return 0;
        }

        if(b==0){
            return 0/a;
        }

        return result;
    }
}