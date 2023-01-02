package utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateUtility {
	public static List<String> formatDates(List<Date> dateList) {
		List<String> list = new ArrayList<String>();
		
		for(Date d : dateList) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, yyyy");
			String date = simpleDateFormat.format(d);
			list.add(date);
		}
		
		return list;
	}
}
