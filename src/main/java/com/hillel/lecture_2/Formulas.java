package com.hillel.lecture_2;

import io.qameta.allure.Step;
import org.apache.velocity.runtime.parser.node.MathUtils;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        ///double result =  Math.pow(1.1 * Math.exp(-x)) + Math.abs(Math.cos(Math.sqrt(Math.PI * x)))- 3d/8d;

        double result =  1.1 * Math.exp(-x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x)))- 3d/8d;

//        TODO implement formula 9
        return result;
    }

    @Step
    public double calculate10Formula(double x) {

        double result = (1d/3d) * Math.sqrt(Math.abs(Math.sin(x))) * Math.cbrt((Math.exp(0.12d *x)));
//        TODO implement formula 10
        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        //result = (Math.pow(Math.exp(-2d + x),
        //                (1d/5d)))*(1d/(Math.sqrt(Math.pow(x, 2)
        //                +Math.pow(x, 4)+Math.log(Math.abs(x-3.14d)))));


        //double result = Math.exp(1.1 -x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x)))- 3d/8d;
        double result = (Math.PI *2d * x) - Math.abs(Math.sin(Math.sqrt(10.5d * x)))
                * (1d/((Math.cbrt(Math.pow(x, 2d)))+ (1d/7d)));
//        TODO implement formula 11
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = Math.log(Math.sqrt(Math.abs(2d-x)) + 1.2d)*(1d/(2d+(Math.exp(-x)))) + Math.cbrt(2d/x);
//        TODO implement formula 12
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = (Math.pow(Math.exp(-2d + x),
                (1d/5d)))*(1d/(Math.sqrt(Math.pow(x, 2)
                +Math.pow(x, 4)+Math.log(Math.abs(x-3.14d)))));
//        TODO implement formula 13
        return result;
    }
}
