package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

//        TODO implements result
        boolean result = true;

        String B="";
        String C=value;
        char[] mass =C.toCharArray();
        char[] mass2=new char[mass.length];
        for ( int i =mass.length-1; i>= 0;){
            for(int j=0;j<mass2.length; j++){

                mass2[j]=mass[i]; i--;

                B+=mass2[j];

            }

        }
        return B.equalsIgnoreCase(C);

    }

}


