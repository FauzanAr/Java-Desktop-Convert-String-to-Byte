/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bytearrayinputstream;

import java.io.*;
/**
 *
 * @author FauzanAr
 */
public class ByteArrayInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        byte[] dataByte = {1,2,3,4,5};
        InputStream input = new java.io.ByteArrayInputStream(dataByte);
        int data = 0;
        while ((data = input.read()) !=-1){
            System.out.println("Data : "+data);
        }
    }
    
}
