package com.hdu.wll.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by DELL(mxd) 
 */
public class CurrentTime {

    public static String getCurrentTime(Date date, String s){
        SimpleDateFormat formatData = new SimpleDateFormat(s);
        return formatData.format(date);
    }



    /**
     * 返回Date格式的
     * @param strDate 字符串形参
     * */
    public static java.sql.Date strToDate(String strDate) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date d = null;
        try {
            d = format.parse(strDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assert d != null;
        return new java.sql.Date(d.getTime());
    }


}
