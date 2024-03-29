import javax.swing.*;
// Внешний класс:
class TheBig{
    // Текстовое поле внешнего класса:
    String name;
    // Поле внешнего класса - объектная
// переменная внутреннего класса:
    TheSmall ID;
    // Конструктор внешнего класса:
    TheBig(String name,int n){
        // Значение текстового поля внешнего класса:
        this.name=name;
        // Создание объекта внутреннего класса:
        ID=new TheSmall(n);
        // Вызов метода внутреннего класса
// через объект внутреннего класса:
        ID.show();}
    // Метод внешнего класса.
// Возвращает текстовую строку с именем объекта
// внешнего класса:
    String getName(){
        String txt="Имя обькта:  "+name+".\n";
        return txt;
    }
// Внутренний класс:
    class TheSmall{
        // Поле внутреннего класса - переменная массива:
        int [] code;
        // Конструктор внутреннего класса:
        TheSmall (int n){
            // Создание массива:
            code=new int[n];
           // Заполнение массива случайными числами (от 0 до 9):
            for(int i=0;i<code.length;i++)
            code[i]=(int)(10*Math.random());}
        // Метод внутреннего класса.
// Возвращает строку с кодом объекта
// внутреннего класса:
        String getCode(){
            // Начальная строка:
            String txt="Коде обькта :  |";
            // Формирование полного текста:
            for(int i=0;i<code.length;i++)
                txt+=code[i]+"|";
            return txt;}
        // Метод для отображения сообщения с именем
// объекта внешнего класса и кодом объекта
// внутреннего класса:
        void show(){
            // Текстовая строка:
        String txt=getName()+getCode();
        // Отображение сообщения:
        JOptionPane.showMessageDialog(null,txt);}
    
    }
}
// Класс с главным методом программы:
public class InnerClassDemo {
 public static void main(String[] args) {
      // Анонимный объект внешнего класса:
     new TheBig("БОЛЬШОЙ",7);
    }
    
}
