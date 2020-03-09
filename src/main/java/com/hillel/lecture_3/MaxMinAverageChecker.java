package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MaxMinAverageChecker {

    @Step
    public int getMaxNumber(int a, int b , int c) {

//        TODO implements result
        int result = Math.max(Math.max(a,b),c);

        return result;
    }

    @Step
    public int getAverageNumber(int a, int b , int c) {

//        TODO implements result
        int result = (a+b+c- Math.min(Math.min(a,b), c)-Math.max(Math.max(a,b), c));;

        return result;
    }

    @Step
    public int getMinNumber(int a, int b , int c) {

//        TODO implements result
        int result = Math.min(Math.min(a,b),c);

        return result;
    }
}
