package phanSo;

/**
 *
 * @author pcct
 */
public class BTVN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        phanSo p1 = new phanSo();
        p1.setT(10);
        p1.setM(20);
        p1.in();
        phanSo p2 = new phanSo();
        p2.setT(4);
        p2.setM(7);
        p2.in();
        phanSo p3 = new phanSo(5,7);
        p3.in();
        p1.hieu(p1, p2);
        p1.tich(4,7);
        p1.tong(p2);
        p2.soSanh(p3);
        p1.rutGon(p1);
    }
    
}