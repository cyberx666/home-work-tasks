package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        Double radius;
        Double angle;
        angle = (Math.sqrt(squareArea) / 2);
        radius = Math.sqrt(circleArea / Math.PI);
        if(radius <=angle) {
            return "The circle is in the square";
        }

        if(radius >=angle){
            return "The circle is in not in the square";

        }

        return result;
    }

}
