/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tapedeck;

public class TestArrays {
   public static void main(String[] aqrs){
  int[] index = new int[4];
   index[0]=1;
   index[1]=3;
   index[2]=0;
   index[3]=2;
       
   String [] islands = new String[4];
   islands[0] = "Бермуды";
   islands[1] = "Фуджи ";
   islands[2] = "Азовские Острова ";
   islands[3] = "Косумель";
   
   int y =0 ;
   int ref ;
   while (y<4){
       ref = index[y];
       System.out.print("Острова = ");
      System.out.println(islands[ref]);
    y+=1; 
   }
   
 } 
}
