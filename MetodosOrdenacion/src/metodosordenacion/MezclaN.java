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
public class MezclaN extends MezclaD {
    int contador;
    public void mezclaD2(int v3[])
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
                    v3[i]=vIzq[j];
                    i++;
                    j++;
                }
                else
                {
                    v3[i]=vDer[k];
                    i++;
                    k++;
                }
            }
            while(vIzq.length!=j)
            {
               v3[i]=vIzq[j]; 
               i++;
               j++;
            }
            while(vDer.length!=k)
            {
                v3[i]=vDer[k];
                i++;
                k++;
            }
    }
        
    }
    public void mezclaN(int arreglo[])
    {
        int izquierda=0;
        int izq=0;
        int derecha=arreglo.length-1;
        int der=derecha;
        boolean ordenado=false;
        do
        {
            ordenado=true;
            izquierda=0;
            while(izquierda<derecha)
            {
                   izq=izquierda;
                   while(izq<derecha && arreglo[izq]<=arreglo[izq+1])
                   {
                       izq++;
                   }
                   der=izq+1;
                   while(der==derecha-1 || der<derecha && arreglo[der]<=arreglo[der+1])
                   {
                       der++;
                   }
                   if(der<=derecha)
                   {
                       contador++;
                       mezclaD2(arreglo);
                       ordenado=false;
                   }
                   izquierda=izq;
            }
           
        }while(!ordenado);
        
    }
  
}
