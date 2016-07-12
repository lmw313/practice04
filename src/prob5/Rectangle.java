package prob5;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		this.width = width * rate;
		this.height = height * rate;

	}

	@Override
	public double getArea() {
		return height * width;
		// TODO Auto-generated method stub

	}

	@Override
	public double getPerimeter() {
		return (2*height) + (2*width);
		// TODO Auto-generated method stub

	}

}
