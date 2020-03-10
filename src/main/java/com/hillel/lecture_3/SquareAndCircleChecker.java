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
        Double radius;
        Double angle;
        angle = (Math.sqrt(squareArea) / 2);
        radius = Math.sqrt(circleArea / Math.PI);
        if(radius <angle) {
            return "The circle is in the square";
        }
        if(radius >=angle){
            return "The circle is not in the square";
        }
        if(radius==angle){
            return "The circle is not in the square";
        }

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
        Double d1;
        double d2;
        d1= (Math.sqrt(4*circleArea/Math.PI));
        d2= Math.sqrt(2*squareArea);

        if(d1>d2) {
            return "The square is in the circle";
        }

        if(d2>=d1){
            return "The square is not in the circle";
        }




        return result;
    }

}
