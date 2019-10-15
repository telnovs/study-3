import javax.swing.*;
public class UsingWhile {
 public static void main(String[] args) {
        // Граница суммы , индексные переменные и переменные для записи сумммы
     int count,i=1,j=1,s1=0,s2=0;
     //Считывание границ суммы
     count=Integer.parseInt(JOptionPane.showInputDialog("Введите границы суммы"));
     //Текстовые прерменные 
     String text="Суммы натуральныз чисел от до "+count+".\n";
     String str1="оператор while:";
     String str2="оператор do-while:";
     //Вычесляем суммы оператора while
     while (i<=count){
         s1+=i;
         ++i;}
      //Вычесляем суммы оператора  do-while
     do{
         s2+=j;
         ++j;
     } while (j<=count) ;
     //Уточнение текста для сообщений 
     str1+=s1+"\n";
     str2+=s2;
     //Вывод окна сообщение на экран 
     JOptionPane.showMessageDialog(null, text+str1+str2);
     
     }
 }
    

