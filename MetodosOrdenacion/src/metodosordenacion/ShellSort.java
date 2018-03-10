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
public class ShellSort {
    int contador;
    public void ordenarShell(int x[])
    {
       
        int salto;
        int i;
        int aux;
        boolean cambios;
        for(salto=x.length/2; salto!=0; salto/=2)
        {
          
            cambios=true;
            while(cambios==true)
            {
                 
                cambios=false;
                for(i=salto;i<x.length;i++)
                {
                    contador++;
                    if(x[i-salto]>x[i])
                    {
                        
                        contador=contador+1;
                        System.out.println(contador);
                        aux=x[i];
                        x[i]=x[i-salto];
                        x[i-salto]=aux;
                        cambios=true;
                        
                    }
                }
            }
        }
        System.out.println("Se hicieron"+" "+contador+" "+"intercambios en shellsort.");
        }
    }

