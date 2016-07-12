package prob5;

public class RectTriangle extends Shape {
	double width;
	double height;

	public RectTriangle() {

	}

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return height * width / 2;
		// TODO Auto-generated method stub

	}

	@Override
	public double getPerimeter() {
		return height + width + (Math.sqrt((height*height) + (width*width)));
		// TODO Auto-generated method stub

	}

}
