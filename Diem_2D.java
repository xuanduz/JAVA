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
public class Diem_2D {
    private double x;
    private double y;
    
    public Diem_2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    
    public double kc(Diem_2D d1, Diem_2D d2){
        return Math.sqrt(Math.pow(d1.x - d2.x, 2) + Math.pow(d1.y - d2.y, 2));
    }

    @Override
    public String toString() {
        return "Point2D " + x + "," + y;
    }
    
    public void doiXung(Diem_2D d){
        System.out.println("Diem doi xung voi " + d.x + "," + d.y + " la: " + (-d.x) + "," + (-d.y));
    }
    
}
