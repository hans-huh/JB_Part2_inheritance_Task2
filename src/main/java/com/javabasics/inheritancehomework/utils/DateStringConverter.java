package com.javabasics.inheritancehomework.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStringConverter {
    private static final String DATE_TO_STRING_CONVERSION_PATTERN = "dd/MM/yyy HH:mm:ss";
    public DateStringConverter(){}

    public static String convertDateToString(Date date){
        DateFormat dateFormat = new SimpleDateFormat(DATE_TO_STRING_CONVERSION_PATTERN);
        return dateFormat.format(date);
    }

    public static Date convertStringToDate(String str) {
        DateFormat dateFormat = new SimpleDateFormat(DATE_TO_STRING_CONVERSION_PATTERN);
        Date date;
        try{
            date = dateFormat.parse(str);
            return date;
        } catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }
}
