import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-serg
 */
public class DotCom {
    private ArrayList<String>locationCells;
    public void setLocationCells(ArrayList<String>loc){
        locationCells = loc;
    }
    public String checkYourSlef(String userInput){
        String rezult = "мимо";
        int  index = locationCells.indexOf(userInput);
        if (index >=0){
            locationCells.remove(index);//Ели индеск больше или равно 0, то заданная пользователем ячейка определенно неходиться в списке, поэтому удаляем ее
            if (locationCells.isEmpty() ){//если список пустой значит было попадание 
                rezult ="Потопил";
            }else{
                rezult ="Попал";
            }//КОНЕЦ IF 
        }//Конец внешнего  if
        return rezult;
    }//конец метода 
}//конец класса

