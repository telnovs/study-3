class MakeObjCopy{
   // Текстовое поле класса:
    String name;
    // Числовое поле класса:
    int namber;
    // Конструктор класса (два аргумента):
    MakeObjCopy(String str,int num){
    name=str;
    namber=num;}
    // Конструктор создания копии:
MakeObjCopy(MakeObjCopy obj){
    name=obj.name;
    namber=obj.namber;}
// Метод для создания копии объекта:
MakeObjCopy copy(){
    // Создание объекта-копии
    MakeObjCopy tmp=new MakeObjCopy(name,namber);
    return tmp;}
// Метод для вывода информации об объекте:
void show(){
    String text="Поле обьекта:\n";
    text+="name: "+name+"\nnamber:"+namber;
// Вывод на консоль:
    System.out.println(text);}
}

public class MakeObjCopyDemo {
 public static void main(String[] args) {
        // Создание объектов
     MakeObjCopy objA=new MakeObjCopy("Первый обьект",100);
     MakeObjCopy objB=new MakeObjCopy(objA);
     // Отображение информации об объектах:
     objA.show();
     objB.show();
     //Изменение ворого обьекта
     objB.name="Второй обьект";
     objB.namber=200;
      //Изменение ворого обьекта
     objA.show();
     objB.show();
   // Копирование обьектов
     objA=objB.copy();
     // Отображение информации об объектах:
     objA.show();
  //Изменение ворого обьекта
     objB.name="Второй обьект изменен";
     objB.namber=300;
      // Отображение информации об объектах:
     objA.show();
     objB.show();
 }
 }
