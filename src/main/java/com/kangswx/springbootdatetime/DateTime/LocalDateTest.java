package com.kangswx.springbootdatetime.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//LocalDate 用于表示当天日期，它只有日期，不包含时间
public class LocalDateTest {
    public static void main(String[] args) {

        //获取当前时间
        LocalDate now = LocalDate.now();
        System.out.println(now);

        //获取指定日期的日期对象
        LocalDate date = LocalDate.of(2000, 1, 1);
        System.out.println(date);

        //获取日期对象的年月日数据
        int year = now.getYear();
        int monthValue = now.getMonthValue();
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("year: "+year);
        System.out.println("monthValue: "+monthValue);
        System.out.println("dayOfMonth: "+dayOfMonth);

        //比较两个日期是否相等
        LocalDate localDate = LocalDate.of(2019, 8, 14);
        System.out.println(now.equals(localDate));

        //日期计算
        LocalDate localDate1 = now.plus(1, ChronoUnit.WEEKS);
        System.out.println(localDate1);

        //日期的比较
        LocalDate localDate2 = LocalDate.of(2000, 1, 1);
        System.out.println(now.isAfter(localDate2));
        LocalDate localDate3 = LocalDate.of(2020, 1, 1);
        System.out.println(now.isAfter(localDate3));

        //时区
        ZoneId shanghaiZoneId = ZoneId.of("Asia/Shanghai");
        ZonedDateTime now1 = ZonedDateTime.now(shanghaiZoneId);

        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime now2 = ZonedDateTime.now(tokyoZoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("上海时间为： " + now1.format(formatter));
        System.out.println("东京时间为： " + now2.format(formatter));

        //解析日期
        String dateText = "20190813";
        LocalDate date2 = LocalDate.parse(dateText, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(date2);

        //格式化日期
        String format = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);

        //日期转换字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format1 = localDateTime.format(formatter1);
        System.out.println(format1);

        //字符串转时间
        String dateTimeText = "2018-08-14 10:25:26";
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeText, formatter1);
        System.out.println(dateTime);
    }
}
