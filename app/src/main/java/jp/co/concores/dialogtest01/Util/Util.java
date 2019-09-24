package jp.co.concores.dialogtest01.Util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Util {

    /**
     * 日付の形式を変更
     * @param year
     * @param month
     * @param dayOfMonth
     * @return
     */
    public static String changeDateFormat(int year, int month, int dayOfMonth){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        SimpleDateFormat yyyyMMddFormat = new SimpleDateFormat("yyyy-MM-dd");

        return yyyyMMddFormat.format(calendar.getTime());
    }

}
