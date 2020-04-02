package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

//        TODO implements result
        boolean isValid = false;


        code = code.replaceAll("[A-Z]", "");
        Integer int1 = Integer.parseInt(String.valueOf(code.charAt(0)));
        Integer int2 = Integer.parseInt(String.valueOf(code.charAt(1)));
        Integer int3 = Integer.parseInt(String.valueOf(code.charAt(2)));
        Integer int4 = Integer.parseInt(String.valueOf(code.charAt(3)));
        Integer int5 = Integer.parseInt(String.valueOf(code.charAt(4)));
        Integer int6 = Integer.parseInt(String.valueOf(code.charAt(5)));
        String var10000 = String.valueOf(int1);
        Integer integer12 = Integer.parseInt(var10000 + String.valueOf(int2));
        var10000 = String.valueOf(int3);
        Integer integer34 = Integer.parseInt(var10000 + String.valueOf(int4));
        var10000 = String.valueOf(int5);
        Integer integer56 = Integer.parseInt(var10000 + String.valueOf(int6));
        int umn = integer12 * integer34 * integer56;
         return false;
    }
}
