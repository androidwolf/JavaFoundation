package test1;

public abstract class Shape {
	private double area;
	Shape() {}
	public double AllAreas() {
		return area;
	}
	
	public static void main(String[] args) {
		double R = 0, x = 0, y = 0, m = 0, n = 0;
		Object[] objects = {new Circle(R), new Square(x, y), new Rectangles(m, n)};
		System.out.println(((Circle) objects[0]).Areas());
		System.out.println(((Square) objects[1]).Areas());
		System.out.println(((Rectangles) objects[2]).Areas());
		System.out.println(((Circle) objects[0]).Areas()+((Square) objects[1]).Areas()+((Rectangles) objects[2]).Areas());
	}

}

class Circle extends Shape {
	double R;
	Circle( double x ) {
		R = x;
	}
	public double Areas() {
		return 3.14*R*R;
	}
}

class Square extends Shape {
	double x;
	double y;
	Square( double x, double y ) {
		this.x = x;
		this.y = y;
	}
	public double Areas( ) {
		return x*y;
	}
}
class Rectangles extends Shape {
	double x;
	double y;
	Rectangles( double x, double y ) {
		this.x = x;
		this.y = y;
	}
	public double Areas( ) {
		return x*y;
	}
}