/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tapedeck;
class Clock{
    String time;
   
   
    void setTime(String t){
        time =t;
     }
     String getTime(  ){
        return time;
    }
}

public class ClockTestDrive {
    public static void main (String[] arqs ){
        Clock c = new Clock();
        c.setTime("3245");
        String tod = c.getTime();
     System.out.println("ВРЕМЯ "+tod);           
    }
}
