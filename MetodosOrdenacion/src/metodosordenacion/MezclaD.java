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
import java.io.*;
public class MezclaD {
    ManejoArchivos manejo = new ManejoArchivos();
    Arreglos obj = new Arreglos();
    int cont;
    public int[] abrirM(String archivo1, String archivo2)
    {
        int r,z;
        int c=0;
        int v1[]=manejo.AbrirArchivo(archivo1);
        int v2[]=manejo.AbrirArchivo(archivo2);
        int v3[]=new int[v1.length+v2.length];
            for(r=0;r<v1.length;r++)
            {
                v3[r]=v1[r];
            }
            for(z=0;z<v2.length;z++)
            {
                v3[r]=v2[z];
                r++;
            }
            
                obj.showArreglo(v3);
                return v3;
        }
    public int[] ordenarMezclaD(int v3[])
    {
        int i,j,k;
        if(v3.length>1)
        {
            int nElementosIzq=v3.length/2;
            int nElementosDer=v3.length-nElementosIzq;
            int vIzq[]= new int[nElementosIzq];
            int vDer[]= new int[nElementosDer];
            for(i=0;i<nElementosIzq;i++)
            {
                vIzq[i]=v3[i];
            }
            for(i=nElementosIzq;i<nElementosIzq+nElementosDer;i++)
            {
                vDer[i-nElementosIzq]=v3[i];
            }
            vIzq=ordenarMezclaD(vIzq);
            vDer=ordenarMezclaD(vDer);
            i=0;
            j=0;
            k=0;
            while(vIzq.length!=j && vDer.length!=k)
            {
                if(vIzq[j]<vDer[k])
                {
                    cont++;
                    v3[i]=vIzq[j];
                    i++;
                    j++;
                }
                else
                {
                    cont++;
                    v3[i]=vDer[k];
                    i++;
                    k++;
                }
            }
            while(vIzq.length!=j)
            {
                cont++;
               v3[i]=vIzq[j]; 
               i++;
               j++;
            }
            while(vDer.length!=k)
            {
                cont++;
                v3[i]=vDer[k];
                i++;
                k++;
            }
    }
        return v3;
}
    public void crearArchivo(int []x,String nombre)
    {
        BufferedWriter bw;
        try
        {
            bw = new BufferedWriter(new FileWriter(nombre+""+".txt"));
            for(int i=0;i<x.length;i++)
            {
                bw.write(x[i]+" ");
            }
            System.out.println("ok");
            bw.close(); 
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
    
 
}
