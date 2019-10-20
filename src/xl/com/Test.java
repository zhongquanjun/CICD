package xl.com;

import java.util.HashMap;

public class Test {
public static void main(String[] args) {
	function();
	
}

public static void function() {
	HashMap <String,Person> map =new HashMap<String,Person>();
	map.put("北京", new Person("小明",23));
	map.put("山东", new Person("一垒",28));
	map.put("四川", new Person("建华",35));
	map.put("广东", new Person("黄志",42));
	
	for(String key: map.keySet()) {
		Person value=map.get(key);
		System.out.println(key+"......."+value);
	}
}
}
