package analizadorlexico;

import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lexer{
                  final ArrayList<Reservada> rs = new ArrayList<Reservada>();
       public ArrayList<Token> lex(String entrada){
              final ArrayList<Token> tokens = new ArrayList<Token>();
              final StringTokenizer st = new StringTokenizer(entrada);
              while(st.hasMoreTokens()){
                     String palabra = st.nextToken();
                     boolean matched = false;
                     for(Tipos tokenTipo: Tipos.values()){
                            Pattern patron = Pattern.compile(tokenTipo.patron);
                            Matcher matcher = patron.matcher(palabra);
                            if(matcher.find()){
                                   boolean ok=true;
                                   Token tk = new Token();                                       
                                   tk.setTipo(tokenTipo);
                                   tk.setValor(palabra);
                                   tokens.add(tk);
                                   if(rs.isEmpty()){
                                       Reservada r = new Reservada(tk.getTipo().toString());
                                       rs.add(r);
                                   }else{
                                       for(Reservada x:rs){                             

                                           if(x.reservada.equals(tk.getTipo().toString())){
                                            
                                               x.size++;
                                               ok=false;
                                           }                             
                                       }
                                       if(ok==true){
                                       Reservada r = new Reservada(tk.getTipo().toString());
                                       rs.add(r);
                                       }
                                          
                                   }
                                   matched=true;
                            }
                     }
                     if(!matched){
                      //   throw new RuntimeException("No existe tal token");
                  }
              }
              return tokens;
       }
}