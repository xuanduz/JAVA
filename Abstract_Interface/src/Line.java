
public class Line implements Shape {

	Point a;
	Point b;
	private Point i;

	public Line(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Line [a=" + a + ", b=" + b + "]";
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double distance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void move(double x, double y) {
		// TODO Auto-generated method stub
		a.setX(a.getX() + x);
		a.setY(a.getY() + y);
		b.setX(b.getX() + x);
		b.setY(b.getY() + y);

	}

	@Override
	public void rotate(double alpha) {
//		// TODO Auto-generated method stub
//		alpha = alpha * Math.PI / 180;
//		double x;
//		double y;
//		x = (0.5 * (a.getX() + b.getX()));
//		y = (0.5 * (a.getY() + b.getY()));
//		// (a.getX() - i.getX())*Math.cos(alpha) - (a.getY() - i.getY())*Math.sin(alpha)
//		// + i.getX()
//		// (a.getX() - i.getX())*Math.sin(alpha) + (a.getY() - i.getY())*Math.cos(alpha)
//		// + i.getY()
//		a.setX((a.getX() - i.getX()) * Math.cos(alpha) - (a.getY() - i.getY()) * Math.sin(alpha) + x);
//		a.setY((a.getX() - i.getX()) * Math.sin(alpha) + (a.getY() - i.getY()) * Math.cos(alpha) + y);
//		b.setX((b.getX() - i.getX()) * Math.cos(alpha) - (b.getY() - i.getY()) * Math.sin(alpha) + x);
//		b.setY((b.getX() - i.getX()) * Math.sin(alpha) + (b.getY() - i.getY()) * Math.cos(alpha) + y);
	}

	@Override
	public void zoom(double x) {
		// TODO Auto-generated method stub

	}

}