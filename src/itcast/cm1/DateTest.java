package itcast.cm1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
  public static void main(String[] args) {
	
}
	
	public static void function() {
		System.out.println("请输入出生日期格式YYYY-MM-dd");
		String brithdayString =new Scanner(System.in).next();
		SimpleDateFormat dsf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date br=dsf.parse(brithdayString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date todaty=new Date();
		long bir=todaty.getTime();
		
	
	}
} 
