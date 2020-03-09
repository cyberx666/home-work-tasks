package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class TriangleChecker {

    @Step
    public String isTriangleIsosceles(int a, int b, int c) {

//        TODO implements result
        String result ="";
        if (a==b){
            return "Isosceles triangle!";
        }
        if (a==c){
            return "Isosceles triangle!";
        }
        if (c==b){
            return "Isosceles triangle!";
        }
        if(c!=b){
            return "No isosceles triangle!";
        }
        if (c!=a){
            return "No isosceles triangle";
        }
        if (b!=a) {
            return "No isosceles triangle";
        }

        return result;
    }
}
