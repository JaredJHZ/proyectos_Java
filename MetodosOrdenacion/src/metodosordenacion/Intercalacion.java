/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Jared
 */
public class Intercalacion {
    int contador;
    public void ordenarIntercalacion(String archivo1, String archivo2)
    {
        QuickSort q = new QuickSort();
        Arreglos obj = new Arreglos();
        ManejoArchivos manejo = new ManejoArchivos();
        BufferedWriter bw;
        int v1[]=manejo.AbrirArchivo(archivo1);
        int v2[]=manejo.AbrirArchivo(archivo2);
        q.ordenarQuick(v1, 0, v1.length-1);
        q.ordenarQuick(v2, 0, v2.length-1);
        int v3[] = new int[v1.length+v2.length];
      
           int i=0;
           int j=0;
           int x=0;
            while(i<v1.length && j<v2.length)
            {
                if(v1[i]>v2[j])
                {
                    v3[x]=v2[j];
                    j++;
                    contador++;
                }
                else
                {
                    
                    v3[x]=v1[i];
                 
                    i++;
                    contador++;
                }
                x++;
            }
            if(i==v1.length)
            {
                for(int c=j;c<v2.length;c++)
                {
                    v3[x]=v2[c];
                    x++;
                    contador++;
                }
            }
            else
            {
                   for(int c=i;c<v1.length;c++)
                {
                       
                       v3[x]=v1[c];
                       x++;
                       contador++;
                }
            }
        
      
        obj.showArreglo(v1);
        obj.showArreglo(v2);
        obj.showArreglo(v3);
       
           try
        {
                 bw = new BufferedWriter(new FileWriter("Intersecalacion.txt"));   
                 for(int a=0;a<v3.length;a++)
                 {
                   bw.write(v3[a]+" ");
                 }
                 bw.close();
                 
        }        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }

}
