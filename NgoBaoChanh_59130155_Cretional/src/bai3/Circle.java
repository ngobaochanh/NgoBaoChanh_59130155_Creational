/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author DELL
 */
public class Circle extends Shape{ 
    private static Shape circle;

    protected Circle()
    {
       super("Hình đa giác...","Đa giác giấy","Khung hình đa giác"); 
    }

    public static Shape createInstance()
    {
        if(circle == null)
            circle = new Circle();
        return circle;
    }     
    
    @Override
    public String draw() {
        return circle.getBrush() + "; " + circle.getPaper() 
               + "; " + circle.getFrame();
    }
    
}