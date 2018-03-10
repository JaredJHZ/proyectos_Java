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
public class QuickSort {
    int contador;
  int partition(int x[], int izq, int der) 
{ 
    int i = izq;
    int j = der; 
    int aux; 
    int pivote = x[(izq + der) / 2];  
        while (i <= j) { 
            while (x[i] < pivote) 
            i++; 
                while (x[j] > pivote) 
                      j--; 
                      if (i <= j)
                        { 
                        contador++;
                        aux = x[i]; 
                        x[i] = x[j]; 
                        x[j] = aux; 
                        i++; 
                        j--; 
                        } 
}; 
 return i; 
} 
public void ordenarQuick(int x[], int izq, int der){ 
   
    int index = partition(x, izq, der); 
    if (izq < index - 1)
    {
    ordenarQuick(x, izq, index - 1);     
    }
   
    if (index < der) 
    {
    ordenarQuick(x, index, der);     
    }
    
   
  
    
}
public void getIntercambios()
{
    System.out.println("Se hicieron"+" "+contador+" "+"intercambios en quicksort.");
}
}
