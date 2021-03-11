
public class Rectangle implements Shape {
	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle(Point a, Point b, Point c, Point d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	public double area() {
		double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
		double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
		return ab * bc;
	}

	@Override
	public double perimeter() {
		double ab = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
		double bc = Math.sqrt(Math.pow(c.getX() - b.getX(), 2) + Math.pow(c.getY() - b.getY(), 2));
		double dc = Math.sqrt(Math.pow(c.getX() - d.getX(), 2) + Math.pow(d.getY() - c.getY(), 2));
		double ad = Math.sqrt(Math.pow(d.getX() - a.getX(), 2) + Math.pow(d.getY() - a.getY(), 2));
		return ab + bc + dc + ad;
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
		d.setX(d.getX() + x);
		d.setY(d.getY() + y);

	}

	@Override
	public void rotate(double alpha) {
		// TODO Auto-generated method stub
		alpha = alpha * Math.PI / 180;
		double x;
		double y;
		x = ((1.0 / 4) * (a.getX() + b.getX() + c.getX() + d.getX()));
		y = ((1.0 / 4) * (a.getY() + b.getY() + c.getY() + d.getY()));
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
		c.setY(y);
		x = ((d.getX() - i.getX()) * Math.cos(alpha) - (d.getY() - i.getY()) * Math.sin(alpha) + i.getX());
		y = ((d.getX() - i.getX()) * Math.sin(alpha) + (d.getY() - i.getY()) * Math.cos(alpha) + i.getY());
		d.setX(x);
		d.setY(y);
		
	}

	@Override
	public void zoom(double z) {
		// TODO Auto-generated method stub
		double x;
		double y;
		x = ((1.0 / 4) * (a.getX() + b.getX() + c.getX() + d.getX()));
		y = ((1.0 / 4) * (a.getY() + b.getY() + c.getY() + d.getY()));
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
		x = (d.getX() - i.getX()) * z + i.getX();
		y = (d.getY() - i.getY()) * z + i.getY();
		d.setX(x);
		d.setY(y);
	}

}
