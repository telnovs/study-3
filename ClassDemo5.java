import javax.swing.*;
// Описание класса:
class MyClass{
    int num;
    char symb;
    String text;

//Конструктор класса без аргументов 
MyClass(){
// заполнение полей 
    set();
    // Отображение сообщения с информацией об объекте:
    showText();
}
// Конструктор с целостным аргументом 
MyClass(int n){
// заполнение полей 
    set(n);
    // Отображение сообщения с информацией об объекте:
    showText();   }
//Конструктор с класса с сибольным аргументом 
MyClass (char s){
   // заполнение полей 
    set(s);
    // Отображение сообщения с информацией об объекте:
    showText();  }
// Конструктор класса с тремя аргументами:
MyClass(int n,char s,String str){
// Заполнение полей:
set(n,s,str);
// Отображение сообщения с информацией об объекте:
showText();}
// Метод класса для отображения сообщения:
void showText(){
// Локальная текстовая переменная:
String str="Значения полей объекта:\n";
// Формирование результата (значения локальной переменной):
str+="num="+num+"\n";
str+="symb="+symb+"\n";
str+="text="+text;
// Метод отображает окно сообщения:
JOptionPane.showMessageDialog(null,str);}
//Метод класса для присваиваение значения полям (нет аргументов)
 void set(){
    num=0;
    symb='a';
    text="НЕТ АРГУМЕНТОВ";
}
void  set(int n){
num=n;
symb='b';
text="Целостный аргумент";}
void  set(char s){
num=1;
symb=s;
text="Сивольный  аргумент";}

void  set(int n,char s,String str){
num=n;
symb=s;
text=str;}
}


public class ClassDemo5 {
  public static void main(String[] args) {
    MyClass obj1=new MyClass();
    MyClass obj2=new MyClass(33);
    MyClass obj3=new MyClass('Z');
    MyClass obj4=new MyClass(3,'A',"Три аргумента");
    }
    
}
