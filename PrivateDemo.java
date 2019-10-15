package privatedemo;
// Суперкласс с закрытыми членами:
class Base{
    // Закрытое текстовое поле:
    private String name;
    // Закрытое числовое поле:
    private int namber;
    // Конструктор суперкласса:
    Base(String name,int namber){
        this.name=name;
        this.namber=namber;
    }
// Закрытый метод суперкласса:
    private void show(){
        System.out.println("Обьект с именем"+name);}
    // Открытый метод суперкласса:
    void showAll(){
        // Обращение к закрытому методу суперкласса:
        show();
        // Обращение к закрытому полю суперкласса:
        System.out.println("Числовое поле равно"+namber);}
    // Открытый метод суперкласса:
    void setAll(String name,int namber){
        // Обращение к закрытым полям суперкласса:
        this.name=name;
        this.namber=namber;}
}
// Подкласс:
class SubBase extends Base{
 // Конструктор подкласса:
    SubBase(String str,int num){
        // Вызов конструктора суперкласса:
        super(str,num);
        // Отображение закрытых "ненаследуемых" полей
        // с помощью наследуемого открытого метода:
     showAll();} 
    }
public class PrivateDemo {
 public static void main(String[] args) {
        // Создание объекта подкласса:
     SubBase obj=new SubBase("Новый ",1);
     // Изменение значений "несуществующих" полей объекта
// подкласса:
     obj.setAll("Тот же самый",2);
     // Отображение значений "несуществующих" полей объекта
//подкласса:
     obj.showAll();
    }
    
}
