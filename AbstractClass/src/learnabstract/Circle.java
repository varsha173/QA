package learnabstract;

public class Circle extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.colorshape();
		c.drawshape();
		c.moveshape();

	}

	@Override
	public void colorshape() {
		System.out.println("coloting shape");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveshape() {
		System.out.println("moving shape");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawshape() {
		System.out.println("drawing shape");
		// TODO Auto-generated method stub
		
	}
	

	
}
