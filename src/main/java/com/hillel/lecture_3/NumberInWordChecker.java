package com.hillel.lecture_3;

import io.qameta.allure.Step;

import static java.lang.System.*;

/**
 * Created by alpa on 10/22/19
 */
public class NumberInWordChecker {

    @Step
    public String getNumberIfElse(int number) {
        //        TODO implements result

        String result = "number";
        if (number == 1) {
            return "ONE";
        }
        if (number == 2) {
            return "TWO";
        }
        if (number == 3) {
            return "THREE";
        }
        if (number == 4){
            return  "FOUR";
        }
        if (number == 5) {
            return "FIVE";
        }
        if (number == 6) {
            return "SIX";
        }
        if (number == 7) {
            return "SEVEN";
        }

        if (number == 8) {
            return "EIGHT";
        }
        if (number == 9) {
            return "NINE";
        }
        else if(number>=9)
            return "OTHER";

        return result;

    }

    @Step
    public String getNumberSwitchCase(int number) {
        //        TODO implements result
        String result = "number";
        switch(number){
            case 1:
                return "ONE";

            case 2:
                return "TWO";

            case 3:
                return "THREE";

            case 4:
                return "FOUR";

            case 5:
                return "FIVE";

            case 6:
               return ("SIX");

            case 7:
                return "SEVEN";

            case 8:
                return "EIGHT";

            case 9:
                return "NINE";

            default:
                return "OTHER";
        }
    }
}
