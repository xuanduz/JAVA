/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pcct
 */
public class BTVN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diem_2D p1 = new Diem_2D(1, 5);
        Diem_2D p2 = new Diem_2D(4, 9);
        Diem_2D p3 = new Diem_2D(6, 4);
        Diem_2D p4 = new Diem_2D(9, 2);

        List<Diem_2D> Point = new ArrayList<>();
        Point.add(p1);
        Point.add(p2);
        Point.add(p3);
        Point.add(p4);
        
        double s = 0;
        for(Diem_2D p : Point){
            s += p.kc(p1, p2);
        }
        
        Diem_3D p11 = new Diem_3D(-1, 2, 5);
        System.out.println(p2.toString());
        p2.doiXung(p2);
    }

}
