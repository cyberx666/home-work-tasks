package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsChecker {

    @Step
    public int countNumberOfWorld(String sentence) {

//        TODO implements result
        //int result = 0;
        String[] lots = sentence.split(" ");
        int i;
        for ( i = 0; i < lots.length; i++) {
            if (lots[i].length() > 0) ;
            //break;
        }



        return i;
    }


}
