import javax.swing.*;
public class UsingFor {
 public static void main(String[] args) {
        // Граница суммы , индексные переменные и переменные для записи сумммы
     int count,i,s=0;
     //Считывание границ суммы
     count=Integer.parseInt(JOptionPane.showInputDialog("Введите границы суммы"));
      //Текстовые прерменная
     String text="Суммы натуральных чисел от до "+count+" = ";
     //Вычесление суммы оператора  FOR
     for(i=1;i<=count;i++){
         s+=i;}
      //Вывод  сообщение на экран 
     JOptionPane.showMessageDialog(null,text+ s);
    }
    
}
