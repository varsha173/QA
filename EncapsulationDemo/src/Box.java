
public class Box {
	private int length;
	private int width;
	private int heigth;
	
	public void SetDimensions(int l,int b, int h) {
		if(l>=1 && b>=1 && h>=1) 
		{
		System.out.println("box dimensions" + l+ " "+b+ " "+h);
		}
		else {
			System.out.println("invalid");
		}
	}
	public int setLength(int l) {
		if(l>=1) {
			length=l;	
		}
		else
		{
			System.out.println("invalid dimension");
		}
		return length;	
	}
	public int setwidth(int b) {
		width=b;
		return width;	
	}
	public int setHeigth(int h) {
		heigth=h;
		return heigth;	
	}
	public int getLength(int l) {
		length=l;
		return length;	
	}
	public int getWidth(int b) {
		width=b;
		return width;	
	}
	public int getHeigth(int h) {
		heigth=h;
		return heigth;	
	}

	public static void main(String[] args) {
		System.out.println("hello");
	}
	
	

}
