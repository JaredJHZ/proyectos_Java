
package Clases;
//creo el arreglo para la clase del alumnno

import Clases.Alumno;


public class Alumnos {
    private Alumno oalumnos[];
    private int actual;
    private int tamaño;
    
    //creo el constructor
    
    public Alumnos(int max){
        this.oalumnos=new Alumno[max];
        this.tamaño=max;
        this.actual=0;
    }

    public Alumno[] getAllAlumnnos() {
        return oalumnos;
    }
    public Alumno getAlumnoInAlumnos(int indice){
        return oalumnos [indice];
    }
    
    //Mira man aqui tienes la idea pero esto no es Viable ya que tienes un arreglo de puros alumnos pues mejor pasa un objeto de tipo alumnos no dato por dato
    
    /*
    public void setOalumnnos(String codigo, String nombre, int edad,String cEscuela, String dEscuela,
            String cCategoria, String dCategoria){
            Escuela oescuela=new Escuela();
            oescuela.setCodigo(cEscuela);
            oescuela.setDescription(dEscuela);
            Categoria ocategoria=new Categoria();
            ocategoria.setCodigo(cCategoria);
            oalumnos[van]=new Alumno();
            ocategoria.setDescription(dCategoria);
          
            oalumnos[van].setCodigo(codigo);
            oalumnos[van].setNombre(nombre);
            oalumnos[van].setEdad(edad);
            oalumnos[van].setOescuela(oescuela);
            oalumnos[van].setOcategoria(ocategoria);
    }*/
    
    public void setAlumnoInAlumnos(Alumno alumno){
        this.oalumnos[actual]=alumno;
        this.actual++;
    }

    public int getActual() {
        return actual;
    }
//No te recomiendo que ocupes un set para el actual eso lo debe manejar el programa por si solo no se debe modificar
    /*
    public void setVan(int van) {
        this.van = van;
    }*/

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
//No entiendo para que quieres tirar una exception...
    public Object getOalumnnos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getoalumnnos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
