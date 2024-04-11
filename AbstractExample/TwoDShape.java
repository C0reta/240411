package AbstractExample;

public abstract class TwoDShape {
	protected double width;
	protected double height;
	protected String name;



	public void showDim() {
		System.out.println("Name: " + this.name);
		System.out.println("Width: " + this.width);
		System.out.println("Height: " + this.height);

	}

	public abstract double area();

}
