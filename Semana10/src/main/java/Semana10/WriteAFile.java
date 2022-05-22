/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana10;
import java.io.*;
/**
 *
 * @author user
 */
public class WriteAFile {
    
            public WriteAFile(String archivo){
                this.wfiles(archivo);
            }
            
            
    private void wfiles(String archivo){
        
        FileWriter fw;
        FileReader fr;
        
        try{
            
            File f = new File(archivo);
            f.canRead();
            
            fw = new FileWriter(archivo);
            
            fw.write("prueba");
            
            fw.close();
            
            fr = new FileReader(archivo);
            
            int valor = fr.read();
            
            while(valor!=-1){
                
                System.out.println((char)valor);
                valor = fr.read();
                
            }
            
            fr.close();
        }
        catch (IOException ex){
            
            System.out.println(ex.getMessage());
        }
        
    }        
                    
}
