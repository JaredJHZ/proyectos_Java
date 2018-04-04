
package Clases;

public class Alumno {
    private String codigo;
    private String nombre;
    private int edad;
    private Categoria ocategoria;
    private Escuela oescuela;
    private Boolean pagoAlCorriente;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public boolean getPago(){
        return this.pagoAlCorriente;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Categoria getOcategoria() {
        return ocategoria;
    }

    public void setOcategoria(Categoria ocategoria) {
        this.ocategoria = ocategoria;
    }
    
    public void setPago(boolean siONo){
        this.pagoAlCorriente = siONo;
    }

    public Escuela getOescuela() {
        return oescuela;
    }

    public void setOescuela(Escuela oescuela) {
        this.oescuela = oescuela;
    }


}
