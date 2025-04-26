package LearnConstructor;

public class Demo {
	
	public Demo()
	{
		//constructor name exactly same as class name 
		// no reutrn type
		System.out.println("no argument constructor");
	}
	public Demo(int i)
	{
		System.out.println("integer constructor");
	}
	public Demo(int i, int y )
	{
		System.out.println("2 integer constructor");
	}
	public Demo(String s)
	{
		System.out.println("string  constructor");
	}

	public static void main(String[] args) {
		
		Demo d = new Demo();
		//Demo d = new Demo(8);
		//Demo d = new Demo(2 ,4);
		//Demo d = new Demo("var");
	}
	

}
