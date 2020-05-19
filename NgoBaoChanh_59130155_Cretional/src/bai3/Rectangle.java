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
public class Rectangle extends Shape{
    private static Shape rectangle;

    protected Rectangle() 
    {
        super("Hinh vuông...","Hình chữ nhật giấy","Khung hình vuông"); 
    }
    
    public static Shape createInstance()
    {
        if(rectangle == null)
            rectangle = new Circle();
        return rectangle;
    }   
    
    @Override
    public String draw() {
        return rectangle.getBrush() + "; " + rectangle.getPaper() 
                + "; " + rectangle.getFrame();
    }
    
}
