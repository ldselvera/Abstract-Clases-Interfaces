abstract class Shape {

	abstract public double area();
	abstract public double volume();
}

class Cube extends Shape {

	int x = 10;
	public double area( ) {

	    return (6 * x * x);
	}	

	public double volume() {
		return (x * x * x);
	}

}

class Circle extends Shape {

	int radius = 1;
	public double area() {
		return (Math.PI * radius * radius);
	}
	public double volume() {
		return 0;
	}
}


class Triangle extends Shape{
    	int base = 10;
        int height=10;
	public double area() {
		return (0.5* base * height);
	}
	public double volume() {
		return 0;
	}
    
}

public class PolymorphismTest {

	public static void main(String args[]) {
		Shape[] s = { new Cube(), new Circle(), new Triangle() };
		for (int i = 0; i < s.length; i++) {
			System.out.println("The area and volume of " + s[i].getClass()
					+ " is " + s[i].area() + " , " + s[i].volume());
		}
	}
}