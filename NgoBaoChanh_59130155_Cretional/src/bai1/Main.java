/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author DELL
 */
public class Main {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        HoaDon hd = new HoaDon.Builder()
                .addHDHeader(new HoaDonHeader("HD001",formatDate.parse("07/02/2025"),"Ngo Bao Chanh"))
                .addCTHD(new CTHD("Pepsi",5,150000,2000))
                .addCTHD(new CTHD("Co gai Ha Lan",7,54000,2000))
                .build();
        System.out.println(hd.toString());
    }
}
