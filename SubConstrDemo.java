import javax.swing.*;
// Суперкласс:
class A{
    // Поля суперкласса:
    int namber;
    char symbol;
    // Конструктор суперкласса без аргументов:
    A(){
      namber=00;
      symbol='A';
      System.out.println("Конструктор без аргументов");
      show();}
    // Конструктор суперкласса с одним аргументом:
    A(int n){
      namber=n;
      symbol='B';
      System.out.println("Конструктор с одним аргументов");
      show();}
    // Конструктор суперкласса с двумя аргументами:
    A(int n,char s){
      namber=n;
      symbol='S';
      System.out.println("Конструктор с двумя аргументов");
      show();}
  // Метод для отображения полей:
    void show(){
        System.out.println("Поле: "+namber+" и "+symbol+".");}
}
// Подкласс:
    class B extends A{
     // Текстовое поле подкласса:
     String text;
     // Конструктор подкласса без аргументов:
     B(){
     // Вызов конструктора суперкласса (без аргументов):
   super();
     text="Текст Без Аргументов";
    showText();}
     // Конструктор подкласса с одним аргументом:
     B(String txt){
     // Вызов конструктора суперкласса (с одним аргументом):
     super(txt.length());
     text=txt;
     showText();}
     // Конструктор подкласса с тремя аргументами:
     B(int n, char s,String txt){
         super(n,s);
         text=txt;
         showText();}
     void showText(){
    System.out.println("Текстовое поле \""+text+"\" . ");}
    }
public class SubConstrDemo {
 public static void main(String[] args) {
        // Создание объектов (анонимных) подкласса.
// Используются разные конструкторы:
    new B();
    new B("Один аргумент");
    new B(1000,'F',"@ аргумент");
 
            }
 
    
}
