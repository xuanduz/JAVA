package phanSo;

import java.util.Vector;
import java.util.Arrays;
import java.util.List;

public class BTVN2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		phanSo ps1 = new phanSo(1,4);
		phanSo ps2 = new phanSo(7,5);
		phanSo ps3 = new phanSo(7,5);
		phanSo ps4 = new phanSo(10,5);
		phanSo ps5 = new phanSo(500,22);
//		List<phanSo> ps = new Vector<phanSo>();
//		ps.add(ps1);
//		ps.add(ps2);
//		ps.add(ps3);
//		ps.add(ps4);
//		ps.add(ps5);
		
		phanSo[] ps = {ps1, ps2, ps3, ps4, ps5};
		
		double max;
		phanSo temp = null;
		max = ps[0].chia(ps[0]);
		for (int i = 0; i < ps.length; i++) {
			if (max < ps[i].chia(ps[i])) {
				max = ps[i].chia(ps[i]);
				temp = ps[i];
			}
		}
		System.out.println("Phan so lon nhat: ");
		temp.in();
		
		max = 0;
		for (int i = 0; i < ps.length; i++) {
			max += ps[i].chia(ps[i]);
		}
		System.out.println("Tong phan so: " + max);
		
		// ktra phan so khong phai so nguyen
		
		System.out.println("Cac phan so khong phai so nguyen:");
		for (int i = 0; i < ps.length; i++) {
			if(ps[i].getT() % ps[i].getM() != 0)
				ps[i].in();
		}
		
		
	}

}
