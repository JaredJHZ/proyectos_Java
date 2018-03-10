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
import java.util.Scanner;
import java.math.*;
public class Arreglos {
    
    
    public void setArreglo(int [] x)
    {
        System.out.println("Escribe los valores del arreglo que es de tamaño"+" "+x.length);
        for(int i=0;i<x.length;i++)
        {
         x[i]=(int)(Math.random()*1000);
        }
    }
    public void showArreglo(int[] x)
    {
        for(int i=0;i<x.length;i++)
        {
            System.out.print(x[i]+" ");
           
        }
         System.out.println("");
    }
    public String getArreglo(int[]x)
    {
        String arreglo="";
        for(int i=0;i<x.length;i++)
        {
            arreglo+=x[i]+" ";
        }
        System.out.println(arreglo);
        return arreglo;
    }
}
