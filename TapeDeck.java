package tapedeck;
 class Tape{
     boolean car= false;
 
void playTape(){
System.out.println("Пленка проигрывается ");
}
void recordTape(){
System.out.println("Идет запись на пленку");
 }
 }


public class TapeDeck {
 public static void main(String[] args) {
     Tape t= new Tape();
     t.car = true;
     t.playTape();
     
     if (t.car == true){
         t.recordTape();
         Output o =new Output();
         o.go();
         
     }
    }
    
}
