import java.util.ArrayList;
import java.util.List;

public class Main_Class {

	public static void main(String[] args) {
		// Set points
		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 0);
		Point p3 = new Point(0, 3);
		Point p4 = new Point(2, 3);

		// Set Circle
		Circle c1 = new Circle(p1, 3);

		// Set Triangle
		Triangle t1 = new Triangle(p1, p2, p3);

		// Set Rectangle
		Rectangle r1 = new Rectangle(p1, p2, p4, p3);

		// Set Line
		Line l1 = new Line(p1, p2);

		// Begin

		List<Shape> Points = new ArrayList<>();
		Points.add(l1);
		Points.add(c1);
		Points.add(t1);
		Points.add(r1);

		for (Shape shape : Points) {
			System.out.println(shape.toString());
		}

		double max_area = 0;
		double max_perimeter = 0;
		Shape temp1 = null;
		Shape temp2 = null;
		for (int i = 0; i < Points.size(); i++) {
			if (max_area < (Points.get(i)).area()) {
				// max_area = (Points.get(i)).area();
				temp1 = Points.get(i);
			}
			if (max_perimeter < (Points.get(i)).perimeter()) {
				temp2 = Points.get(i);
			}
		}
		System.out.println("hinh " + temp1.toString() + " co dien tich lon nhat = " + temp1.area());
		System.out.println("hinh " + temp2.toString() + " co chu vi lon nhat = " + temp2.perimeter());

		// Move()
		System.out.println("Move");
		System.out.println("Ban dau: " + t1.toString());
		t1.move(2, 3);
		System.out.println("Sau move(2,3) " + t1.toString());

		// Rotate()
//		System.out.println("Rotate");
//		System.out.println("Ban dau: " + l1.toString());
//		l1.rotate(45);
//		System.out.println("Sau rotate: " + l1.toString());

	}

}