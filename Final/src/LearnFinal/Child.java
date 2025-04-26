package LearnFinal;

public class Child extends Parent{
	
	public  final int i =10;

	public static void main(String[] args) {
		
		Child c = new Child();
		System.out.println(c.i);
		//c.i = 20;
		//System.out.println(c.i); // we declare the final keyword with instance variable i so cant able to print 20.it will show error
		c.setData();

	}
	/*public  void setData()
	{
		System.out.println(i);
	}
	*/ // cannot override setdata method as it defined as final keyword in parent class

}
