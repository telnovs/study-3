import javax.swing.*;
// Описание класса 
class MyClass{
    int num;
    char symb;
    String text;
}
// Главный  класса программы 

public class ClassDemo {
    public static void main (String [] arqs){
        MyClass obj=new MyClass();
        //Заполнение полей обекта
        obj.num =31;
        obj.symb='D';
        obj.text="Всем привет !!!!!";
      // Текст для отображенения окна сообщения
        String str="Значение полей обекта\n";
        str+="num="+obj.num+"\n";
        str+="symb="+obj.symb+"\n";
        str+="text="+obj.text+"\n";
        //Отображение окна
        JOptionPane.showMessageDialog(null, str);}   
}
