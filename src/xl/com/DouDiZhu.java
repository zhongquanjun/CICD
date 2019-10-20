package xl.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DouDiZhu {
	public static void main(String[] args) {
		
		HashMap<Integer, String> pooker = new HashMap<Integer, String>();

		ArrayList<Integer> pookerNumber = new ArrayList<Integer>();
		ArrayList<Integer> player1 = new ArrayList<Integer>();
		ArrayList<Integer> player2 = new ArrayList<Integer>();
		ArrayList<Integer> player3 = new ArrayList<Integer>();
		ArrayList<Integer> bottom = new ArrayList<Integer>();

		String[] numbers = { "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3" };
		String[] colors = { "♥", "♠", "♣", "■" };

		int index = 2;

		for (String number : numbers) {
			for (String color : colors) {
				pooker.put(index, color + number);
				pookerNumber.add(index);
				index++;
			}
		}
		pooker.put(0, "大王");
		pookerNumber.add(0);

		pooker.put(1, "小王");
		pookerNumber.add(1);

		//System.out.println(pookerNumber);
		Collections.shuffle(pookerNumber);
		// System.out.println(pookerNumber);

		for (int i = 0; i < pookerNumber.size(); i++) {
			if (i < 3) {
				bottom.add(pookerNumber.get(i));
			}
			if (i % 3 == 0) {
				player1.add(pookerNumber.get(i));
			} else if (i % 3 == 1) {
				player2.add(pookerNumber.get(i));
			} else if (i % 3 == 2) {
				player3.add(pookerNumber.get(i));
			}
		}
		Collections.sort(player1);
		Collections.sort(player2);
		Collections.sort(player3);
		look("刘德华",player1,pooker);
		look("张曼玉",player2,pooker);
		look("林青霞",player3,pooker);
		look("底牌",bottom,pooker);
		
	}
	public static void look(String name,ArrayList<Integer> plsy,HashMap<Integer,String> pooker) {
		System.out.print(name+"    ");
		for(Integer key:plsy) {
			String value=pooker.get(key);
			System.out.print(value);
		}
		System.out.println();
	}
	
}
