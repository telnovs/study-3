/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-serg
 */ 
import javax.swing.*;
public class UsingIf {
    public static void main (String [] arqs){
            // числа числитель и знаменатель:
    double x,y;
    // заголовок окна :
    String title="Деление чисел";
    // Тектсовое сообщение (Началььное знаяение):
    String text="Результать деление ";
    // переменная определяет тип :
    int type;
    // Счтивание числителя :
    x=Double.parseDouble(JOptionPane.showInputDialog("Числитель"));
    // Счтивание знаменатель :
     y=Double.parseDouble(JOptionPane.showInputDialog("знаменатель"));
    // Усдовний оператор : равен ли нулю знаменатель:
    if(y!=0){type=JOptionPane.PLAIN_MESSAGE;//знаменатель НЕ РАВЕНЬ НУЛЮ 
        text=text+x+" / "+y+" = "+x/y;}
    else {type=JOptionPane.ERROR_MESSAGE;//знаменатель  РАВЕНЬ НУЛЮ 
        text=text+"Деление на ноль ";}
    //Отобращать сообщение :
    JOptionPane.showMessageDialog(null,text, title, type);
    }
}