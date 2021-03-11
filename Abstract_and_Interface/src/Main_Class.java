import java.util.ArrayList;
import java.util.List;

public class Main_Class {

	public static void main(String[] args) {
		// Set points
		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 0);
		Point p3 = new Point(0, 3);
		Point p4 = new Point(2, 3);
		Point p5 = new Point(0, 0);
		Point p6 = new Point(4, 0);
		Point p7 = new Point(0, 2);
		Point p8 = new Point(4, 2);
		Point p9 = new Point(10, 10);
		Point p10 = new Point(14, 14);


		// Set Circle
		Circle c1 = new Circle(p1, 3);

		// Set Triangle
		Triangle t1 = new Triangle(p2, p3, p4);

		// Set Rectangle
		Rectangle r1 = new Rectangle(p5, p6, p7, p8);

		// Set Line
		Line l1 = new Line(p9, p10);

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
		System.out.println("------------------------Move------------------------");
		System.out.println("Ban dau: " + t1.toString());
		t1.move(2, 3);
		System.out.println("Sau move(2,3) " + t1.toString());

		// Rotate()
		System.out.println("------------------------Rotate------------------------");
		System.out.println("Rotate line");
		System.out.println("Ban dau: " + l1.toString());
		l1.rotate(45);
		System.out.println("Sau rotate 45: " + l1.toString());
		l1.rotate(-45);
		System.out.println("Sau rotate -45: " + l1.toString());
		System.out.println("Rotate Rectanle");
		System.out.println("Ban dau: " + r1.toString());
		r1.rotate(45);
		System.out.println("Sau rotate 45: " + r1.toString());
		r1.rotate(-45);
		System.out.println("Sau rotate -45: " + r1.toString());
		
		System.out.println("------------------------Zoom------------------------");
		System.out.println("Zoom Rectangle");
		System.out.println("Truoc khi Zoom: " + r1.toString());
		r1.zoom(3.0);
		System.out.println("Sau khi Zoom x3: " + r1.toString());
		r1.zoom(1.0/3);
		System.out.println("Sau khi Zoom x1/3: " + r1.toString());
		
		
	}

}
