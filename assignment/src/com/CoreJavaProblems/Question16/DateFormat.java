import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateFormat {
    public static void main(String[] args) throws ParseException {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter date in format dd-mm-yyyy");
        String first=read.nextLine();
        System.out.println("Enter date in format dd-mm-yyyy");
        String second=read.nextLine();
        System.out.println(findOldDate(first,second));
    }
    public static String  findOldDate(String first,String second) throws ParseException
    {
        SimpleDateFormat simpledate1=new SimpleDateFormat("dd-MM-yyyy");
        Date date1=simpledate1.parse(first);
        Date date2=simpledate1.parse(second);
        Calendar cal=Calendar.getInstance();
        cal.setTime(date1);
        int day1=cal.get(Calendar.DAY_OF_MONTH);
        int m1=cal.get(Calendar.MONTH);
        int y1=cal.get(Calendar.YEAR);
        cal.setTime(date2);
        int day2=cal.get(Calendar.DAY_OF_MONTH);
        int m2=cal.get(Calendar.MONTH);
        int y2=cal.get(Calendar.YEAR);
        SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("MM/dd/yyyy");
        String res=null;
        if(y1==y2)
        {
            if(m1==m2)
            {
                if(day1==day2)
                {
                    res=simpleDateFormat2.format(date1);
                }
            }
            else
            {
                if(m1>m2)
                    res=simpleDateFormat2.format(date2);
                else
                    res=simpleDateFormat2.format(date1);
            }
        }
        else
        {
            if(y1>y2)
                res=simpleDateFormat2.format(date2);
            else
                res=simpleDateFormat2.format(date1);
        }

        return res;
    }
}
