package com.practice.strings;

import org.testng.annotations.Test;

public class TimeConvert {

    /*
    Given a time in -hour AM/PM format, convert it to military (24-hour) time.
    Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
    - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
    Example

    s='12:01:00 PM'

    Return '12:01:00'.

    s='12:01:00 AM'

    Return '00:01:00'.
     */

    @Test
    public void timeConvertTest() {

        // 12:00 AM -> 00:00:00
        // 12:11 PM -> 12:11:00

    //TODO in-progress
        String s = "03:01:00 PM";
        String time = s.substring(0, s.length() - 2).trim();
        String timeType = s.substring(s.length() - 2).trim();
        String output = "";

        if (timeType.equals("AM")) {
            if (time.startsWith("12"))
                output = "00" + time.substring(2);
            else
                output = time;
        } else {
            if (time.startsWith("12"))
                output = time;
            else
                output = 12 + time.substring(0, 2) + time.substring(2);
        }

        System.out.println(output);


    }
}
