package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

//        TODO implements result
        int[] result = new int[0];

    boolean sorted = false;
    int temp;
        while (!sorted) {
        sorted = true;
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                temp = values[i];
                values[i] = values[i + 1];
                values[i + 1] = temp;
                sorted = false;
            }
        }
    }
        return values;
    }


    @Step
    public int[] fromMaxToMin(int[] values) {

//        TODO implements result
        int[] result = new int[0];

        int temp;
        for (int i = 0; i < values.length; i++) {
            for (int k = i + 1; k < values.length; k++) {
                if (values[i] < values[k]) {
                    temp = values[i];
                    values[i] = values[k];
                    values[k] = temp;
                }
            }

        }
            return values;
    }

   }

