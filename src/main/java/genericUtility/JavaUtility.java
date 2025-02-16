package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtility {
	
	
	public String  getCalendarDetails(String pattern)
	{
		Calendar cal= Calendar.getInstance();
		Date d= cal.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat(pattern);
		String value= sdf.format(d);
		return value;
		
	}

}
