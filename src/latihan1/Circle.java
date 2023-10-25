/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1;

/**
 *
 * @author fatiq
 */
public class Circle extends Shape {
    private float radius;
    
    public Circle (float radius){
        this.radius = radius;
    }

    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }

}
