package secondclass.thirdprogram;

final public class Rectangle {
	
	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double computeArea() {
		
		return (width * height);
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}
	
	

}
