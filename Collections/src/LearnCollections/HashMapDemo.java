package LearnCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// hash map contains data as key, value pairs
		//contains only unique keys
		//not synchronized and no order
		//java hash map may have one null key and multiple null values
		
		HashMap<String, String> hmp =new HashMap<String, String>();
		hmp.put("qa", "var");
		hmp.put("oja", "luc");
		hmp.put("uf", "ljlds");
		
		System.out.println(hmp);
		
		//hmp.remove("qa");
		//hmp.remove("oja", "luc");
		//System.out.println(hmp);
		
		//Set s = hmp.keySet();
		
		//for each loop
		for(String key:hmp.keySet()) {
			System.out.println("key is: "+key+" value is:"+hmp.get(key));
			
		}
		
		Set s = hmp.keySet();
		Iterator<String> itr = s.iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println("key is: "+key+" value is:"+hmp.get(key));
		}


	}

}
