/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;

import javax.swing.*;
import java.awt.GridLayout;

/**
 *
 * @author Jared
 */
public class MetodosOrdenacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Arreglos obj = new Arreglos();
      int x[]= new int[100];
      //crea arreglos
      obj.setArreglo(x);
      int x2[]=x;
      int x3[]=x;
      int x4[]=x;
      obj.showArreglo(x);
      
      //Ordenamiento interno
      BubbleSort b = new BubbleSort();
      QuickSort q = new QuickSort();
      ShellSort s = new ShellSort();
      RadixSort r = new RadixSort();
      
      //ordena
      b.ordenarBubble(x);
      q.ordenarQuick(x2, 0, x.length-1);
      q.getIntercambios();
      s.ordenarShell(x3);
      r.OrdenarRadix(x4, x3.length);
      
      //Ordenamiento externo
      Intercalacion i = new Intercalacion();
      MezclaD md = new MezclaD();
      MezclaN mn = new MezclaN();
      
      
      //Muestra los arreglos
      obj.showArreglo(x);
      obj.showArreglo(x2);
      obj.showArreglo(x3);
      obj.showArreglo(x4);
      
        System.out.println("Bienvenido al sistema de ordenamiento seleccione que tipo de ordenamiento desea ejecutar");
        
       
   ;
     
    }
    
}
