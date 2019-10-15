
package tapedeck;


public class Hobbtis {
    String name;

public static void main(String [] aqrs){

    Hobbtis[] h = new Hobbtis[3];
    int z =-1;
    
    while (z<2){
        z+=1;
    h[z]=new Hobbtis();
    h[z].name="Бильбо";
   
    if (z==1){
       h[z].name="Фродо";
    }
    if (z==2){
        h[z].name="Сем";
    }
   System.out.print(h[z].name+ " - ");
   System.out.println("Имя хорошего хоббита");
   }   
 }
} 