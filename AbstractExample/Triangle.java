package AbstractExample;

public class Triangle extends TwoDShape {
	private String style;

	public void showStype() {
		System.out.println(this.style);
	}

	@Override
	public double area() {
		return this.width * this.height / 2;
	}

	public void setStyle(double width, double height, String name) {
		this.width = width;
		this.height = height;
		this.name = name;
	}

}
