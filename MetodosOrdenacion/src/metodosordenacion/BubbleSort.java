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
public class BubbleSort {
    int contador=0;
    public void ordenarBubble(int []x)    
    {
        int aux;
        for(int i=1;i<x.length-1;i++)
        {
            for(int j=0;j<(x.length-i);j++)
            {
                if(x[j+1]<x[j])
                {
                    aux=x[j];
                    x[j]=x[j+1];
                    x[j+1]=aux;
                    contador++;
                }
            }
        }
        System.out.println("Se hicieron"+" "+contador+" "+"intercambios en bubblesort.");
        
    }
}
