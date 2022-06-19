package com.example.unittestsubject;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilits {


    public static boolean checkFIOValidity(String FIO){
        if(FIO.length() - FIO.replace(" ","").length() == 2 || FIO.length() - FIO.replace(" ","").length() == 3)
            return true;
        else
            return false;
    }


    public static boolean Password(String str)
    {
        boolean specFlag = false;
        if(str.matches(".*[;!@#$%^&*()_+=№%?*~`<>/|{}].*"))
        {
            specFlag = true;
        }

        char ch;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean HowMutch = false;
        if(str.length() > 7)
            HowMutch = true;
        for(int i=0;i < str.length();i++) {
            ch = str.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            }
            if(numberFlag && capitalFlag && lowerCaseFlag && str.length() > 7 && specFlag == true && HowMutch == true)
                return true;
        }
        return false;

    }

    public static boolean Login(String a){


        if(a.length() > 5)
            return true;
        else
            return false;

    }

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);



    public static boolean checkEmailForValidity(String email){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        return  matcher.find();
    }


}
