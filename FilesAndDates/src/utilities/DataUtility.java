package utilities;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DataUtility {
	
	public static List<Date> loadData(String filePath) {
		Scanner sc;
		File file;
		List<Date> dateList = new ArrayList<Date>();
		
		try {
			file = new File(filePath);
			sc = new Scanner(file);
			
			while(sc.hasNextLine()) {
			    Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sc.next());
				dateList.add(date);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return dateList;
	}

	
	public static void writeData(String path, List<String> stringList) {
		File file;
		try {
			file = new File(path);

			if(file.canWrite()) {
				FileWriter fr = new FileWriter(file);
				
				for(String str : stringList)
					fr.write(str+"\n");
				
				fr.close();
			}
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
