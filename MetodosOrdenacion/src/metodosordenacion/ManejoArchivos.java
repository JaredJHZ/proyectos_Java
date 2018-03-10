/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;

/**
 *
 * @author Jared
 */
import java.util.*;
import java.io.*;

public class ManejoArchivos {
    BufferedWriter bw;
    public int[] AbrirArchivo(String nombre)
    {
        int contador=0;
        File archivo = new File(nombre);
        int i=0;
        try
        {
            int x[];
           
            Scanner leer = new Scanner(archivo);
            while(leer.hasNext())
            {
                
                leer.useDelimiter("\\s");
                leer.next();
                contador++;
                
            }
            x= new int [contador];
            leer.close();
            Scanner escribir = new Scanner(archivo);
            while(escribir.hasNext())
            {
                x[i]= Integer.parseInt(escribir.next());
                escribir.useDelimiter("\\s");
                i++;
            }
            escribir.close();
            return x;
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No se encontró el archivo");
           return null;
        }
        
    }

}
