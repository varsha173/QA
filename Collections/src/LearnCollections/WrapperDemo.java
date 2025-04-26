package LearnCollections;

public class WrapperDemo {

	public static void main(String[] args) {
		//defined primitve data type int
		int i =10;
		
		//for int data type there is an integer class so create an object
		//wrapping primitive data type into an object
		Integer int1 = new Integer(i);//wrapping - auto boxing
		
		System.out.println(int1);
		
		int j = int1;//unwrapping-auto unboxing
		
		System.out.println(j);
		
	}

}
