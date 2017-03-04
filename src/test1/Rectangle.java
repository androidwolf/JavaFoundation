package test1;

public class Rectangle {
	private double width;
	private double height;
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle( 4, 40);
		Rectangle b = new Rectangle( 3.5, 35.9);
		System.out.print(a.getwidth() + "\t");
		System.out.print(a.getheight() + "\t");
		System.out.print(a.getArea() + "\t");
		System.out.print(a.getPerimeter() + "\n");
		System.out.print(b.getwidth() + "\t");
		System.out.print(b.getheight() + "\t");
		System.out.print(b.getArea() + "\t");
		System.out.print(b.getPerimeter() + "\n");
	}
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	Rectangle( double m, double n ) {
		width = m;
		height = n;
	}
	
	double getwidth() { return width; }
	double getheight() { return height; }
	
	double getArea() {
		return ( width * height );
	}
	
	double getPerimeter() {
		return ( 2 * ( width + height ) );
	}
	

}
