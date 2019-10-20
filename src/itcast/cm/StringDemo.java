package itcast.cm;

public class StringDemo {
  public static void main(String[] args) {
     	
	  	//getCount("Array Hash265");
	 //System.out.println( toConvert("arraySDDHasFh265"));
	 
	System.out.println(getStringcount("hellojavahellojavahellojavahellojavahellojava","java"));
}
  public static void getCount(String str) {
	  int upper=0;
	  int lopwer=0;
	  int digit=0;
		
	  for(int i=0 ; i<str.length(); i++) {
		  char c=str.charAt(i);
		  if(c>=65 && c<=90) {
			  upper++;
		  }else if(c>=97 && c<=122) {
			  lopwer++;
		  }else if(c>=48 && c<=57) {
			  digit++;
		  }
		  
	  }
	  System.out.println(upper);
	  System.out.println(lopwer);
	  System.out.println(digit);
  }
  
  
  public static String toConvert(String str) {
	  String before=str.substring(0, 1);
	  String after=str.substring(1);
	  
	  before=before.toUpperCase();
	  after=after.toLowerCase();
	  
	  return before+after;
  }
  
  public static int getStringcount(String str,String key) {
  
     int count=0;
     int index=0;
     
     while((index=str.indexOf(key))!=-1) {
    	 count++;
    	 //str=str.substring(beginIndex)
    	 str=str.substring(index+key.length());
    	 
     }
     return count;
  }
}
