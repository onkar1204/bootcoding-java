package com.bootcoding.discount.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DiscountValidityGenerator {

    public static Date getValidity(int days){



        Calendar calender = Calendar.getInstance();
        calender.setTime(new Date());
        calender.add(Calendar.DATE, days);
        return  calender.getTime();



    }

        }


