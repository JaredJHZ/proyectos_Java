/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pseudoaleatorios;

/**
 *
 * @author Jared
 */
public class Pseudoaleatorios {

    public static double[] cuadradosMedios(String semilla, int cantidad){
        double[] coleccion = new double[cantidad]; // creamos una coleccion y la instanciamos aqui se almacenaran los numeros pseudo... ya saben la r
        int y; 
        int x;
        int semillaSize; // esta variable sirve para saber el size inicial de nuestro valor semilla
        try{
            // convertimos el valor de string a entero lo hago aqui para aprovechar el manejo de excepcione pensando que se usara en una GUI en un futuro y por si ponen algo que no sea digitos pues mandar un error
          x=Integer.valueOf(semilla);
          // Preguntamos si la semilla contiene mas de 3 digitos ya saben la regla de este metodo es D>3 , si no cumple con esto pues regresamos un null y se para todo
          if(semilla.length()<4){
              return null;
          }
          //Si la ejecucion del programa llega aqui significa que los valores dados son viables asi que empezamos lo chido como diria Luisito Comunica 
          semillaSize = semilla.length(); //sacamos el size de la semilla
          for(int i=0;i<cantidad;i++){ // empezamos un ciclo para sacar n numeros, esto lo define en usuario, es el parametro cantidad del metodo
              y = (int)Math.pow(x, 2);
              String aux = String.valueOf(y); // creamos una variable aux que almacena el numero elevado al cuadrado de x
              if(aux.length()>3){ // preguntamos si el numero al cuadrado es mayor que 3 para continuar con el codigo 
                    int aux2 = (aux.length()- semillaSize)/2; //aqui determinamos donde se va a empezar a tomar los numeros de enmedio
                    x = Integer.valueOf(aux.substring(aux2,  semillaSize+aux2)); //este esta interesante aqui partimos el string del indice que sacamos en la sentencia anterior hasta la sentencia anterior sumadoi al size de la semilla
                    coleccion[i]= ((double)x/Math.pow(10,  semillaSize));     //ahora simplemente guardamos el numero real , aqui es donde sacamos r, osea que dividimos el valor de x entre 10 elevado al valor del size de la semilla para que se transforme pues de ej 1234 a 0.1234 ya saben porque pues es probabilidad.
               }
            }
          //cuando acabe el ciclo simplemente regresamos el array con todos los numeros reales generados
          return coleccion;  
            
        }catch(Exception ex){
            // si causa un error el programa mandamos null, erika por que me rompiste el kokoro a mi y a Karen 
            return null;
        }
    }
    //como pueden ver el linea fue mucho mas facil jaja para empezar pues solicitamos en forma de parametros las constantes que ocupa el metodo
    public static double[] lineal(String semilla, int a,int c,int m,int cantidad){
        // lo mismo que arriba se crea un array para almacenar los numeros pseudoaleatorios (r)
        double[] coleccion = new double[cantidad];
        try{
            int x = Integer.valueOf(semilla);
            for(int i=0;i<cantidad;i++){
                x = ((a*x)+33)%m; // se pasa la formula tal cual jaja
                coleccion[i]= (double) x / (m-1); // se guarda el numero real
            }
            return coleccion; // cuando terminan las iteraciones se regresa el array de numeros reales
        }catch(Exception ex){
            return null;
        }
    }
   // vamos equipo si se puede, ahora hay que peeguntar si se requiere un gui ahorita o hasta que se saquen los 4096
    
}
