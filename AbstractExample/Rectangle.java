package AbstractExample;

public class Rectangle extends TwoDShape {
	public void isSquare() {
		if (this.width == this.height) {
			System.out.println("This rectangle is a square.");
		} else
			System.out.println("This rectangle is not a square.");
	}

	@Override
	public double area() {
		return this.width * this.height;
	}

	public void setStyle(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}

}
