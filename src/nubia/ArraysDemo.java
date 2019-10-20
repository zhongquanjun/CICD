package nubia;

import java.util.Arrays;

public class ArraysDemo {
public static void main(String[] args) {
	int []  arr= {85,45,96,21,52,78,100,96,50,68};
	int [] newArray=test(arr);
    System.out.println(Arrays.toString(newArray));	
}


public static int[] test(int [] arr) {
	Arrays.sort(arr);
	
	int[] result=new int[3];
	System.arraycopy(arr, 0, result, 0, 3);
	
	return  result;
}

public static void af() {
	int t=5;
	int g=9;
	
	//int result=t.add(g);
}


}
