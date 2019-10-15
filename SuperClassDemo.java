// Суперкласс:
class SuperClass{
    // Поля суперкласса:
   int namber;
   String name;
   // Метод суперкласса:
   void setNamber(int n){
       namber=n;}
   }
// Подкласс:
class SubClass extends SuperClass{
    // Поле подкласса:
    char symbol;
    // Метод подкласса:
    void setAll(int n,String txt,char s){
       // Вызов метода, описанного в суперклассе:
        setNamber (n);
        // Обращение к полю, описанному в суперклассе:
        name=txt;
        // Присваивание значения полю подкласса:
        symbol=s;}
        // Метод подкласса:
        void show(){
        System.out.println("Числовое поле : "+namber);
        System.out.println("Текстовое  поле : "+name);
        System.out.println("Символьное  поле : "+symbol);}
    }
// Класс с главным методом программы:
public class SuperClassDemo {
 public static void main(String[] args) {
     // Создание объекта подкласса:
  SubClass obj=new SubClass();
  // Присваивание полям объекта значений:
  obj.setAll(100,"Текст",'Ы' );
  // Отображение значений полей:
  obj.show();
  // Изменение значений полей объекта:
  obj.setNamber(20);
  obj.name="нОВЫЙ";
  obj.show();
    
 
 }   
}
