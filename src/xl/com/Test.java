package xl.com;

import java.util.HashMap;

public class Test {
public static void main(String[] args) {
	function();
	
}

public static void function() {
	HashMap <String,Person> map =new HashMap<String,Person>();
	map.put("����", new Person("С��",23));
	map.put("ɽ��", new Person("һ��",28));
	map.put("�Ĵ�", new Person("����",35));
	map.put("�㶫", new Person("��־",42));
	
	for(String key: map.keySet()) {
		Person value=map.get(key);
		System.out.println(key+"......."+value);
	}
}
}
