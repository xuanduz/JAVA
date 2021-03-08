import java.util.ArrayList;
import java.util.List;

public class BTVN3 {

	public static void main(String[] args) {
        Diem_2D p1 = new Diem_2D(1, 5);
        Diem_2D p2 = new Diem_2D(4, 9);
        Diem_2D p3 = new Diem_2D(6, 4);
        Diem_2D p4 = new Diem_2D(9, 2);

        List<Diem_2D> Point = new ArrayList<Diem_2D>();
        Point.add(p1);
        Point.add(p2);
        Point.add(p3);
        Point.add(p4);
        
        //double s = 0;
        for(Diem_2D p : Point){
            System.out.println(p.toString());
        }
        
        System.out.println(p2.toString());
        p2.doiXung(p2);
        Diem_3D p11 = new Diem_3D(-1, 2, 5);
        
        // add diem doi xung thanh danh sach
        Diem_3D p12 = new Diem_3D(1,3,6);
        Diem_3D p13 = new Diem_3D(6,5,8);
        Diem_3D p14 = new Diem_3D(10,33,66);
        List<Diem_3D> P3D = new ArrayList<Diem_3D>();
        P3D.add(p11.doiXung(p11));
        P3D.add(p12.doiXung(p12));
        P3D.add(p13.doiXung(p13));
        P3D.add(p14.doiXung(p14));
        for (Diem_3D diem_3d : P3D) {
			System.out.println(diem_3d.toString());
		}
    }

}
