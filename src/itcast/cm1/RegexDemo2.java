package itcast.cm1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegexDemo2 {
	public static void main(String[] args) {
		//checkMail();
		function();
	}
	
	public static void checkMail() {
		String email="sasf@sina.com";
		boolean b=email.matches("[a-zA-Z0-9_]+@[0-9a-z]+\\.[a-z]+");
		System.out.println(b);
	}
	
	public static  void function() {
		SimpleDateFormat df=new SimpleDateFormat("YYYY-MM");
		String date=df.format(new Date());
		
		System.out.println(date);
	}
	
}
 