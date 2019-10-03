/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileinputstream;

import java.io.*;
/**
 *
 * @author FauzanAr
 */
public class ContohFileInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int i = 0;
            FileInputStream data = new FileInputStream("D:\\Kuliah\\Sem 5\\Pemrograman Jaringan\\W7\\CV.txt");
            while((i = data.read())!= -1){
                System.out.print((char)i);   
            }
        } catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
