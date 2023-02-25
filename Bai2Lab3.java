/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2lab3;

/**
 *
 * @author HOANG PHUC
 */
public class Bai2Lab3 {

    public static void main(String[] args) {
        
    
       
    
    public  class vector{
        private double x;
        private double y;
        private double z;   
     
    public vector(double x, double y, double z ){
        this.x = x;
        this.y = y;
        this.z = z;       
    }   
    public double getx(){
        return x;      
    }
    public double gety(){
        return y; 
    }
    public double getz(){
        return z; 
}
public vector cong(vector v) {
    return new vector(x + v.getx(), y + v.gety(), z + v.getz());
}
public vector tru(vector v) {
    return new vector(x - v.getx(), y - v.gety(), z - v.getz());
}
public vector nhan(double k) {
    return new vector(k * x, k * y, k * z);
}
public double nhanVH(vector v) {
    return x * v.getx() + y * v.gety() + z * v.getz();
}
    }
}
    }

