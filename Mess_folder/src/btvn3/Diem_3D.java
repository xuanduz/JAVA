/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btvn3;

/**
 *
 * @author pcct
 */
public class Diem_3D extends Diem_2D{
    private double z;
    
    public Diem_3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }
    
    public double kc(Diem_3D d1, Diem_3D d2){
        return Math.sqrt(Math.pow(d1.getX()-d2.getX(), 2) + Math.pow(d1.getY()-d2.getY(), 2) + Math.pow(d1.z-d2.z, 2));
    }
    
    @Override
    public String toString() {
        return "Point3D " + this.getX() + "," + this.getY() + "," + z; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void doiXung(Diem_3D dx){
        System.out.println("Diem doi xung voi " + dx.getX() + "," + dx.getY() + "," + dx.z +" la: " + (-dx.getX()) + "," + (-dx.getY()) + "," + (-dx.z));
    }
}
