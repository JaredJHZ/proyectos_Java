/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorlexico;

import java.util.ArrayList;

/**
 *
 * @author Jared
 */
public class Analizadorlexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lexer lex = new Lexer();
        String input = "11 + 32 - 33 = define /n";
        ArrayList<Token> tokens = lex.lex(input);
     
        for(Token token: tokens){
           
            System.out.println(token.getTipo()+":"+token.getValor());
        }     
        for(Reservada r: lex.rs){
            System.out.println(r.reservada+":"+r.size);
        }
    }
    
}
