import javax.swing.*;
class AssignObj{
    String text;
    AssignObj(){
        text="Новый  текст";}
    AssignObj(String str){
text=str;}
    void show(){
   JOptionPane.showMessageDialog(null,text);
   }
}  
public class AssindObjDemo {
  public static void main(String[] args) {
        // Создание обьекта 
      AssignObj objA=new AssignObj();
      AssignObj objB= new AssignObj("Второй бьект");
      objA.show();
      objB.show();
      
      objA=objB;
      objA.show();
      objB.text=("Изменен второй обьект");
      objA.show();
    }
  }
