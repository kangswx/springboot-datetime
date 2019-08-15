package com.kangswx.springbootdatetime.DateTime;

import java.time.LocalTime;

//LocalTime 用于表示当天时间, 它只有时间，不包含日期。
public class LocalTimeTest {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime localTime = now.plusHours(2);
        System.out.println(localTime);
    }
}
