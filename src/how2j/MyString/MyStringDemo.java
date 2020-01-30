package how2j.MyString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyStringDemo {
    public static void main(String[] args) throws ParseException {
        MyString s = new MyString();
        s.setS("dddd");
        System.out.println(s.append("sss"));
        System.out.println(s.insert(2, "sss"));
        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(d));
        Date date=simpleDateFormat.parse("2018-12-30 12:12:12");
        System.out.println(simpleDateFormat.format(date));
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        System.out.println("今天：\t" + simpleDateFormat.format(now.getTime()));
        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        c.set(Calendar.DATE, 1);
        System.out.println("下个月倒数第三天:\t" +simpleDateFormat.format(c.getTime()));
    }
    }



