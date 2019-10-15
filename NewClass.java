package tapedeck;
 class Output{
     void go() {
         int x=0;
         int y =30;
     for(int outer =0; outer <3; outer ++){
     for(int inter =4; inter>1; inter--){
        
        x+=3;
         y-=2;  
         if ( x == 6){
         break;   
     }
             x+=3;
     } 
     y-=2;
     }
      System.out.println(x +" "+y ); 
   }     
 }


public class NewClass {
    
}
