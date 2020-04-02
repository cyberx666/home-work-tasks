package com.hillel.lecture_6;

import io.qameta.allure.Step;

import java.util.Arrays;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

//        TODO implements result
        String result = "";
        String upper = word.toUpperCase();

        return upper;
    }

    @Step
    public String toLowerCase(String word) {

//        TODO implements result
        String result = "";
        String lower = word.toLowerCase();

        return lower;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {

//        TODO implements result
        String result = "";
        String delimetr;




        String[] subStr = sentence.split("\\." + " ");
        for (int i = 0; i < subStr.length; i++) {

            String string = subStr[i];
            String var = string.substring(0, 1).toUpperCase();
            subStr[i] = var + string.substring(1);
            result += subStr[i]+" ";


        }


            return result;
        }




    @Step
    public String eachLetterToUpperCase(String sentence){

//        TODO implements result
            String result = "";


            String[] subStr = sentence.split( " ");
            for (int i = 0; i < subStr.length; ++i) {
                String string = subStr[i];
                String var = string.substring(0, 1).toUpperCase();
                subStr[i] = var + string.substring(1);
                //result = Arrays.toString(subStr);
                result += subStr[i]+" ";
            }


                return result;
            }

}
