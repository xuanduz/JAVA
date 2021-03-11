
public class Triangle implements Shape {

	private Point a;
	private Point b;
	private Point c;
	private Point i;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	@Override
	public double area() {

		return 0.5 * Math
				.abs((b.getX() - a.getX()) * (c.getY() - a.getX()) - (c.getX() - a.getX()) * (b.getY() - a.getY()));
	}

	@Override
	public double perimeter() {
		double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
		double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
		double ac = Math.sqrt(Math.pow(c.getX() - a.getX(), 2) + Math.pow(c.getY() - a.getY(), 2));
		return ab + bc + ac;
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
		c.setX(c.getX() + x);
		c.setY(c.getY() + y);
	}

	@Override
	public void rotate(double alpha) {
		// TODO Auto-generated method stub
//		alpha = alpha * Math.PI / 180;
//		double x;
//		double y;
//		x = ((1 / 3) * (a.getX() + b.getX() + c.getX()));
//		y = ((1 / 3) * (a.getY() + b.getY() + c.getY()));
//		// (a.getX() - i.getX())*Math.cos(alpha) - (a.getY() - i.getY())*Math.sin(alpha)
//		// + i.getX()
//		// (a.getX() - i.getX())*Math.sin(alpha) + (a.getY() - i.getY())*Math.cos(alpha)
//		// + i.getY()
//		a.setX((a.getX() - i.getX()) * Math.cos(alpha) - (a.getY() - i.getY()) * Math.sin(alpha) + x);
//		a.setY((a.getX() - i.getX()) * Math.sin(alpha) + (a.getY() - i.getY()) * Math.cos(alpha) + y);
//		b.setX((b.getX() - i.getX()) * Math.cos(alpha) - (b.getY() - i.getY()) * Math.sin(alpha) + x);
//		b.setY((b.getX() - i.getX()) * Math.sin(alpha) + (b.getY() - i.getY()) * Math.cos(alpha) + y);
//		c.setX((c.getX() - i.getX()) * Math.cos(alpha) - (c.getY() - i.getY()) * Math.sin(alpha) + x);
//		c.setY((c.getX() - i.getX()) * Math.sin(alpha) + (c.getY() - i.getY()) * Math.cos(alpha) + y);

	}

	@Override
	public void zoom(double x) {
		// TODO Auto-generated method stub

	}

}
