package com.rsunkara.gendevtest.GeneralDevTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TestUTC {

    private static String toISO8601UTC(Date date) {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
        df.setTimeZone(tz);
        return df.format(date);
    }

    public static void main(String []args) {
        long startTimeStamp = 1566964800000L;
        Date startDate = new Date(startTimeStamp);

        System.out.println("Final Timestamp:" + toISO8601UTC(startDate));
    }
}
