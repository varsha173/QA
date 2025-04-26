
public class Create {

	public static void main(String[] args) {
		Box x = new Box();
		
		//int h = x.heigth=10;
		//int l = x.length=20;
		//int b = x.width=30;
		//x.SetDimensions(l,b,h);
		
		int l = x.setLength(12);
		int h = x.setHeigth(-10);
		int b = x.setwidth(20);
		
		x.SetDimensions(l, b, h);
		
		System.out.println(x.getHeigth(0));
		
		
	}

}
