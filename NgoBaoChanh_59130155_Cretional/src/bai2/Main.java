/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author DELL
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStringBuilder str = new MyStringBuilder("Bai tap ")
                .addString("chuong ")
                .addFloat(6)
                .addBool(true);
        System.out.println(str.toString());
    }
}
