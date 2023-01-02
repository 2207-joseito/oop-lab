import java.util.Date;
import java.util.List;

import utilities.DataUtility;
import utilities.DateUtility;

public class ClientApp {

	
	
	public static void main(String[] args) {
		List<Date> dateList = DataUtility.loadData("./datafile.txt");
		
		List<String> formattedDateList = DateUtility.formatDates(dateList);
		
//		for(String d : formattedDateList) {
//			System.out.println(d);
//		}
		
		DataUtility.writeData("./outputfile.txt", formattedDateList);
	}

}
