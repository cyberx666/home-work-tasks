package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    @Step
    public double checkDiscountCount(double price) {

//        TODO implements result
        double result = price;

        if (price>1000){
            return price-price*0.15;

        }
        else if(price<1000){
            return 0.0;
        }

        return result;
    }
}
