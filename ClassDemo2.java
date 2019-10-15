import javax.swing.*;
// Описание класс
class MyClass{
    int num;
    char symb;
    String text;

//Метод класса
String showText(){
//Докальная текстовая переменная
String str="Значение полей обекта \n";
//Формерование результата переменной
str+="num="+num+"\n";
str+="symb="+symb+"\n";
str+="text="+text+"\n";
//Метод вазваращение значения
return str;
}
}
public class ClassDemo2 {
 public static void main(String[] args) {
     MyClass obj=new MyClass();
      //Заполнение полей обекта
        obj.num =31;
        obj.symb='D';
        obj.text="Всем привет !!!!!";
JOptionPane.showMessageDialog(null,obj.showText());         
 }
}
