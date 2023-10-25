/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author fatiq
 */
public class Triangle extends Shape {

    private float base;
    private float height;
    
    public Triangle (int base, int height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    float getArea() {
        return 0.5f * base * height;
     }
    
}
 