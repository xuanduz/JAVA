
public class Triangle implements Shape {

	private Point a;
	private Point b;
	private Point c;

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
		alpha = alpha * Math.PI / 180;
		double x;
		double y;
		x = ((1.0 / 3) * (a.getX() + b.getX() + c.getX()));
		y = ((1.0 / 3) * (a.getY() + b.getY() + c.getY()));
		Point i = new Point(x, y);

		x = ((a.getX() - i.getX()) * Math.cos(alpha) - (a.getY() - i.getY()) * Math.sin(alpha) + i.getX());
		y = ((a.getX() - i.getX()) * Math.sin(alpha) + (a.getY() - i.getY()) * Math.cos(alpha) + i.getY());
		a.setX(x);
		a.setY(y);
		x = ((b.getX() - i.getX()) * Math.cos(alpha) - (b.getY() - i.getY()) * Math.sin(alpha) + i.getX());
		y = ((b.getX() - i.getX()) * Math.sin(alpha) + (b.getY() - i.getY()) * Math.cos(alpha) + i.getY());
		b.setX(x);
		b.setY(y);
		x = ((c.getX() - i.getX()) * Math.cos(alpha) - (c.getY() - i.getY()) * Math.sin(alpha) + i.getX());
		y = ((c.getX() - i.getX()) * Math.sin(alpha) + (c.getY() - i.getY()) * Math.cos(alpha) + i.getY());
		c.setX(x);
		c.setX(x);
	}

	@Override
	public void zoom(double z) {
		// TODO Auto-generated method stub
		double x;
		double y;
		x = ((1.0 / 3) * (a.getX() + b.getX() + c.getX()));
		y = ((1.0 / 3) * (a.getY() + b.getY() + c.getY()));
		Point i = new Point(x, y);
		
		x = (a.getX() - i.getX()) * z + i.getX();
		y = (a.getY() - i.getY()) * z + i.getY();
		a.setX(x);
		a.setY(y);
		x = (b.getX() - i.getX()) * z + i.getX();
		y = (b.getY() - i.getY()) * z + i.getY();
		b.setX(x);
		b.setY(y);
		x = (c.getX() - i.getX()) * z + i.getX();
		y = (c.getY() - i.getY()) * z + i.getY();
		c.setX(x);
		c.setY(y);


	}

}
