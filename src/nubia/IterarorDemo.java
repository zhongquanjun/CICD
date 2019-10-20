package nubia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterarorDemo {
	
	public static void main(String[] args) {
			Collection<String> coll =new ArrayList<String>();
			coll.add("abs1");
			coll.add("abs2");
			coll.add("abs3");
			coll.add("abs4");
			coll.add("abs5");
			
			Iterator<String> t=coll.iterator();
			//System.out.println(t.hasNext());
			while(t.hasNext()) {
				System.out.println(t.next());
					
			}
	}
	
	 

}
