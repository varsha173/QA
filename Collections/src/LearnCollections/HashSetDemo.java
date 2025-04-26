package LearnCollections;

import java.util.HashSet;
//import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hsdemo = new HashSet<Integer>();
		hsdemo.add(10);
		hsdemo.add(20);
		hsdemo.add(30);
		hsdemo.add(40);
		System.out.println(hsdemo);
		
		hsdemo.remove(10);
		System.out.println(hsdemo);
		
		//Iterator itr = hsdemo.iterator();
		//while(itr.hasNext()) {
		//	System.out.println(itr.next());
		//}
		
		for(Integer intdemo: hsdemo) {
			System.out.println(intdemo);
		}

	}

}
