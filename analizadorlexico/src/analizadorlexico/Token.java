package analizadorlexico;

public class Token {
       public  int size;
       private Tipos tipo;
       private String valor;
       public Tipos getTipo(){
              return tipo;
       }
       public void setTipo(Tipos tipo){
              this.tipo = tipo;
       }
       public void setValor(String valor){
              this.valor = valor;
       }
        public String getValor(){
              return this.valor;
       }
      

}
 enum Tipos{
              Numero("[0-9]+"),
              OperadorArtitmetico("[*|/?|+|-]"),
              Letras("[A-Z]"),
              tabulador("[\t]"),
              cicloFor("for"),
              cicloWhile("while"),
              palabraReservadaClase("clase"),
              palabraReservadaConstante("define"),
              dosPuntos(":"),
              operadorLogico("[<|>|=|!=]"),
              saltoDeLinea("\n"),
              espacio("/s");
              ;
              public final String patron;
              Tipos(String s){
                     this.patron = s;
              }
       }