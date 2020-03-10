package com.hillel.lecture_3;

import io.qameta.allure.Step;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by alpa on 10/22/19
 */
public class PassFailChecker {

    @Step
    public String checkNumber(int number) {

//        TODO implements result
        String result = "";
        if (number>=50){
            return "PASS";
             }

        else {
            return "FAIL";
        }


    }
}

