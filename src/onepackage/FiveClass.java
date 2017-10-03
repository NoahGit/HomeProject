package onepackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FiveClass {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str_date = sdf.format(date);
		System.out.println(str_date);
		
		String str = "2008-07-10 07:18:53";
		try {
			Date date_parse = sdf.parse(str);
			System.out.println(date_parse);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("格式有误");
			e.printStackTrace();
		}
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.clear();
		gc.set(Calendar.YEAR,2007);
		gc.set(Calendar.MONTH,9);
		gc.set(Calendar.DAY_OF_MONTH,21);
		gc.set(Calendar.HOUR_OF_DAY,12);
		gc.set(Calendar.MINUTE,56);
		gc.set(Calendar.SECOND,50);
		System.out.println(gc.get(Calendar.MONTH));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(gc.getTime()));
	}
}
