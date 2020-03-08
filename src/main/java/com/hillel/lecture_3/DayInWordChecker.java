package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DayInWordChecker {

    @Step
    public String getDayIfElse(int number) {
        //        TODO implements result
        String result = "number";
        if (number == 1) {
            return "Monday";
        }
        if (number == 2) {
            return "Tuesday";
        }
        if (number == 3) {
            return "Wednesday";
        }
        if (number == 4){
            return  "Thursday";
        }
        if (number == 5) {
            return "Friday";
        }
        if (number == 6) {
            return "Saturday";
        }
        if (number == 7) {
            return "Sunday";
        }

        else if(number>=8)
            return "Not a valid day";


        return result;
    }

    @Step
    public String getDaySwitchCase(int number) {
        //        TODO implements result
        String result = "number";
        switch (number) {
            case 1: {
                return "Monday";
            }
            case 2: {
                return "Tuesday";
            }
            case 3: {
                return "Wednesday";
            }
            case 4: {
                return "Thursday";
            }
            case 5: {
                return "Friday";
            }
            case 6: {
                return "Saturday";
            }
            case 7:{
                return "Sunday";
            }
            default:{
                return "Not a valid day";
            }



        }


    }
}
