/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buffinputstring;
import java.io.*;
/**
 *
 * @author FauzanAr
 */
public class ContohBuffInputString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileInputStream fin=new FileInputStream("D:\\Kuliah\\Sem 5\\Pemrograman Jaringan\\W7\\CV.txt");
            BufferedInputStream bin=new BufferedInputStream(fin);
            int i = 0;
            while ((i = bin.read())!=-1){
                System.out.print((char)i);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
