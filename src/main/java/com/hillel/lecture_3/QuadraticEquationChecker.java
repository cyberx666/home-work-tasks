package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {
//        TODO implements result
        String result = "d";
        double d = Math.pow(b, 2d) - 4d * a * c;
        double x1 = (-b+(Math.sqrt(Math.pow(b,2d)-(4*a*c)))) / (2d*a);
        double x2 = (-b-(Math.sqrt(Math.pow(b,2d)-(4*a*c)))) / (2d*a);
        double e = (-b/(2*a));
        if (a==0){
            return "The 'a' coefficient should not be zero!";
        }
        if (d<0){
            return "No roots on the set of real numbers!";

        }
       if (d==0){
           return "Two real, identical roots: [x1 && x2] =" +" " + -b/(2*a);

        }
        if(d>0){
            return"Discriminant:"+" "+ d+","+" " + "x1:"+" " + x1+"," +" "+ "x2:" + " " +x2;


        }



        return result;
    }

}
