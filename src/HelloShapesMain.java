import model.Shape;
import model.Square;
import model.Triangle;

public class HelloShapesMain {

	public static void main(String[] args) {
		
		Square square1 = new Square("square1", 2.0);
		Triangle triangle1 = new Triangle("triangle1", 2.0, 2.0);
		
		System.out.println("square1(name, size): " + square1.getName() + ", " + square1.getSize() );
		System.out.println("triangle11(name, size): " + triangle1.getName() + ", " + triangle1.getSize() );
		
		Shape square2 = new Square("square1", 2.0);
		Shape triangle2 = new Triangle("triangle1", 2.0, 2.0);		

		System.out.println("square2(name, size): " + square2.getName() + ", " + square2.getSize() );
		System.out.println("triangle2(name, size): " + triangle2.getName() + ", " + triangle2.getSize() );
	
	}

}
