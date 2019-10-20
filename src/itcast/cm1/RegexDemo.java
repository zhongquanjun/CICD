package itcast.cm1;

public class RegexDemo {
	
	public static void main(String[] args) {
		//checkQQ();
		//checkTel();
		//split_t() ;
		//split_3();
		repladAll();
	}
	
    public static void checkQQ() {
    	
    	    	String QQ="1234567";
    	
    	boolean b=QQ.matches("[1-9][0-9]{4,9}");
                if(b==true) {
                	System.out.println("匹配正确");
                }else {System.out.println("匹配不正确");}

    }
    
    
    public static void checkTel() {
    	String telnumber="13345678923";
    	boolean b=telnumber.matches("1[3-8][\\d]{9}");
    	if(b==true) {
        	System.out.println("匹配正确");
        }else {System.out.println("匹配不正确");}

    }
    
    public static void split_t() {
    	String mi="12-52-8-2-54-62-41-8d54-85-96-41";
    	
    	String [] atrarr=mi.split("t");
    	for(int i=0;i<atrarr.length;i++) {
    		System.out.println(atrarr[i]);
    	}
    }
    
    public static void split_3() {
    	String ip="192.168.9.181";
    	String [] str=ip.split(".");
    	for(int i=0;i<str.length;i++) {
    		System.out.println(str[i]);
    }}
    
    public static void repladAll() {
    	String str="hellow1234569745sjlfjsdlfjslfjsl";
    	String sr=str.replaceAll("[\\d]", "#");
    	
    	System.out.println(str);
    	System.out.println(sr);
    }
    
}
