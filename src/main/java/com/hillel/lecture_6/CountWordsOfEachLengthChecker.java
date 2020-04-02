package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {

//        TODO implements result
        int result = 0;

        String words[] = sentence.split(" ");
        int i;
        for (i = 0; i < wordLength; i++) {
            if (words[i].length() > wordLength) {
               break;
            }
            //return (i==size);
        }
        return i;

    }


}
