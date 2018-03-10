package monse;
public class Crypting{
       String word;
       int espacio = 4;
       Crypting(String word){
              this.word = word;
       }
       Crypting(){

       }
       void setWord(String word){
              this.word = word;
       }
       void initCrypting(){
              try{
                     char alfabeto[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                     boolean bandera;
                     char[] encrypMessage = new char[word.length()];
                     word.toLowerCase();
                     for(int i=0;i<word.length();i++){
                         int x = 0;
                         bandera = false;
                         while(!bandera){
                             if(Character.isWhitespace(word.charAt(i))){
                                 encrypMessage[i]='\u0020';
                                 bandera=true;
                             }else{
                            if(alfabeto[x]==word.charAt(i)){
                                bandera=true;
                                if((x+espacio)>alfabeto.length){
                                    int aux = (x+espacio)-alfabeto.length;
                                    encrypMessage[i] = alfabeto[aux];
                                }else {
                                    encrypMessage[i] = alfabeto[x+espacio];
                                }      
                            }
                            x++;
                         }
                         }
                     }
                    this.word = String.valueOf(encrypMessage);
                    
                 }catch(Exception e){
                     System.out.println(e.getStackTrace());
                 }
       }
       void uncrypt(){
              try{
                     char alfabeto[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
                     boolean bandera;
                     char[] msg = new char[word.length()];
                     word.toLowerCase();
                     for(int i=0;i<word.length();i++){
                         int x = 0;
                         bandera = false;
                         while(!bandera){
                             if(Character.isWhitespace(word.charAt(i))){
                                 msg[i]='\u0020';
                                 bandera=true;
                             }else{
                            if(alfabeto[x]==word.charAt(i)){
                                bandera=true;
                                if((x-espacio)<0){
                                    int aux=(x-espacio)+26;
                                    msg[i] = alfabeto[aux];
                                }else msg[i] = alfabeto[x-espacio];  
                            }
                            x++;
                         }
                         }
                     }
                     this.word = String.valueOf(msg);
                 }catch(Exception e){
                     System.out.println(e.getMessage());
                 }
       }
      String getWord(){return this.word;}
}