/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;


/**
 *
 * @author fatiq
 */
public class Main {
    public static void main(String[] args) {
        Shape segitiga = new Triangle(7,1);
    
        Shape lingkaran = new Circle(8);
        
        System.out.println("Luas Segitiga\t: "+ segitiga.getArea());
        System.out.println("Luas Lingkaran\t: "+ lingkaran.getArea());
    }
}
