import javax.swing.*;
// Описание класс
class MyClass{
int num;
char symb;
String text;

// Метод класса для отображения сообщений 
void showText(){
//Локальная текстовая переменная
String str="Значение полей обекта \n";
// Формерование результата переменной
str+="num="+num+"\n";
str+="symb="+symb+"\n";
str+="text="+text+"\n";
//Метод отображения окно сообщений 
JOptionPane.showMessageDialog(null,str);
}
//Метод класса для присваения значения полям
void set(int n,char s,String str){
    //Заполнение полей
    num=n;
    symb=s;
    text=str;}
 }

public class ClassDemo3 {
  public static void main(String[] args) {
        //Создание обьектов
      MyClass obj1=new MyClass();
      MyClass obj2=new MyClass();
      //Заполнение поля обьекта
      obj1.set(10,'A',"Всем привет!!");
      obj2.set(200,'b',"Еще раз всем привет!!!");
      // оТОБРАДЕНИЕЯ ОКОН
      obj1.showText();
      obj2.showText();}
}

      String frist = reader.next();