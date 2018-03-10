/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basededatos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author alejandra_lap
 */
public class BaseDatos {
    public static Boolean generateTXT(int numeroControl, String periodo, int semestre,String n){
        File archivo = new File(n);
        FileWriter fichero;
        PrintWriter pw = null;
        try{
            String[] aPaternos = {"Prieto","Grajales","Vargas","Vivas","Ramit","Cruz","Garcia","Molina","Ambrosio","Guzman","Perez","Florentino","Oyosa","Patraca","Pastrana","Valdivieso","Torres","Gonzales","Benitez","Hernandez","Mauricio","Vasconselos","Ruiz","Ramirez","Broissin","Muñoz","Artigas","Palafox","Chaves","Camargo","Rodriguez","De La Cruz","Altamirano","Santiago","Pineda","Maldonado","Zamudio","Aquino","Angel","Sanchez","Carpio","Navarrete","Narvaes","Lara","Blanco","Beltran","Napoleon","Mussolini"};
            String[] nombre = {"Jared","Jesus","Sayb","Miranda","Alejandra","Karen","Daniela","Claudia","Oscar","Gabriel","Gerardo","Guadalupe","Ramit","Mario","Sarah","Elena","Paola","Keila","Oswaldo","Diana","Jaime","Juan","Jose","Merari","Angelica","Pedro","Angelina","Arlyn","Samantha","Ana","Xochitl","Ashe","Julissa","Josafhat","Josefina","Melissa","Jaqueline","Arantza","Edgar","Eleanor","Ruth","Samuel","Janetzy","Jacobo","Isaias","Cantares","Genesis","Josue","Maria","Flavia","Roberto","Mikasa","Rei","Abigail","Tatiana","Soledad","Lisa","Eren"};       
            fichero =new FileWriter(archivo,true);
            pw = new PrintWriter(fichero);
            for(int i=0;i<25;i++){
            int random = (int) Math.floor(Math.random()*aPaternos.length);
            int random2 = (int) Math.floor(Math.random()*aPaternos.length);
            pw.println("INSERT INTO Alumnos VALUES("+""+numeroControl+","+"'"+aPaternos[random]+"',"+"'"+aPaternos[random2]+"',"+"'"+nombre[random]+"',"+"'IGE"+"','"+periodo+"',"+"'"+semestre+"');");     
            numeroControl++;
            
            }       
        }catch(IOException ex){
            ex.printStackTrace();
        }finally{
            pw.close();
            return true;
        }
        
    }
}
