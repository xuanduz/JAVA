public class Circle implements Shape {

	private Point o;
	private double r;

	public Circle(Point o, double r) {
		this.o = o;
		this.r = r;
	}

	// Getter and Setter

	@Override
	public String toString() {
		return "Circle [o=" + o + ", r=" + r + "]";
	}

	public Point getO() {
		return o;
	}

	public void setO(Point o) {
		this.o = o;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * r;
	}

	@Override
	public double distance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(double x, double y) {
		// TODO Auto-generated method stub
		o.setX(o.getX() + x);
		o.setY(o.getY() + y);
	}

	@Override
	public void rotate(double alpha) {
		// TODO Auto-generated method stub

	}

	@Override
	public void zoom(double x) {
		// TODO Auto-generated method stub

	}

}