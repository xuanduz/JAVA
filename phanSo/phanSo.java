/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn2;

/**
 *
 * @author pcct
 */
public class phanSo {

    private int T;
    private int M;

    public phanSo() {

    }

    public phanSo(int T, int M) {
        this.T = T;
        this.M = M;
    }

    public int getM() {
        return M;
    }

    public int getT() {
        return T;
    }

    public void setM(int M) {
        this.M = M;
    }

    public void setT(int T) {
        this.T = T;
    }

    public void in() {
        System.out.println(T + " / " + M);
    }

    public void tong(phanSo P) {
        phanSo S = new phanSo();
        S.T = this.T * P.M + P.T * this.M;
        S.M = this.M * P.M;
        System.out.println("Tong: " + S.T + " / " + S.M);
    }

    public void hieu(phanSo s1, phanSo s2) {
        double tu, mau;
        tu = s1.T*s2.M - s2.T*s1.M;
        mau = s1.M*s2.M;
        System.out.println("Hieu: " + tu + " / " + mau);
    }

    public void tich(int tu, int mau) {
        phanSo S = new phanSo();
        S.T = this.T * tu;
        S.M = this.M * mau;
        System.out.println("Tich: " + S.T + " / " + S.M);
    }

    public void thuong(int tu, int mau) {
        phanSo S = new phanSo();
        S.T = this.T * tu + mau * this.M;
        S.M = this.M * tu;
        System.out.println("Thuong: " + S.T + " / " + S.M);
    }

    public void soSanh(phanSo p) {
        if (this.T / this.M == p.T / p.M){
            if (this.T % this.M > p.T % p.M){
                System.out.println("Lon hon: " + this.T + " / " + this.M);
            }
            else{
                System.out.println("Lon hon: " + p.T + " / " + p.M);
            }
        }
        else{
            if ((this.T / this.M) > p.T / p.M) {
                System.out.println("Lon hon: " + this.T + " / " + this.M);
            } else {
                System.out.println("Lon hon: " + p.T + " / " + p.M);
            }
        }
        
    }
    public int UCLN(int tu, int mau){
        if (mau == 0)  return tu;
        return UCLN(mau, tu % mau);
    }
    public void rutGon(phanSo s1){
        int u = s1.UCLN(s1.T, s1.M);
        System.out.println("Phan so " + s1.T + "/" + s1.M + " rut gon: " + s1.T/u + "/" + s1.M/u);
    }
}
