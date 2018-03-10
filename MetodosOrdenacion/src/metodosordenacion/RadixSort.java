/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosordenacion;
import java.util.*;
/**
 *
 * @author Jared
 */
public class RadixSort {
    int contador;
    private int getMax(int x[], int n)
    {
        int mayor = x[0];
        for (int i = 1; i < n; i++)
        {
            if(x[i]>mayor)
            {
                mayor=x[i];
            }
            
        }
        return mayor;
    }
    private void countSort(int x[],int n,int exp)
    {
        int output[] = new int[n]; 
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);
        
        
        for (i = 0; i < n; i++)
            count[ (x[i]/exp)%10 ]++;
 
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        for (i = n - 1; i >= 0; i--)
        {
            output[count[ (x[i]/exp)%10 ] - 1] = x[i];
            count[ (x[i]/exp)%10 ]--;
        }
        for (i = 0; i < n; i++)
        {
           contador++;
            x[i] = output[i];
        }
            
    }
   public void OrdenarRadix(int x[],int n)
   {
       
        int m = getMax(x, n);
        for (int exp = 1; m/exp > 0; exp *= 10)
        {
            countSort(x, n, exp);
            contador++;
            
        }
            
        
         System.out.println("Se hicieron"+" "+contador+" "+"intercambios en radix.");
   }
}
