import java.io.*;
class SimpleDotCom{
    int [] locationCells;
    int numOfHits;
 // Создаем сеттер    
  public void setLocationCells(int[] locs){
       locationCells = locs;
   }
   // создаем метод
  public String checkYourSlef(String stringGuess){
      // Преобразоваваем тип String в int
       int guess = Integer.parseInt(stringGuess);
       // Создаем переменнуя для хранения результата, который
       //будет возвращать "мимо"
       String rezult = "мимо";
       // Повторяем для каждой ячейки из массива locationCells
      for (int cell:locationCells){
       // Сравниваем ход рользавателя с этим элементом(ячейкой) массива   
          if (guess== cell){
             
              rezult = "Попал";
              // мы обнарежили попадение и выходим ихз цыкла 
              numOfHits++;
              break;
          }
      }
      // проверяем не потопили ли мы , если да то выводим "Потопили"
  if (numOfHits==locationCells.length){
      rezult="Потопили";
  }
  // Выводим пользователю мимоесли не был изменен результат на попал и потопил 
      System.out.println(rezult);
      // Возвращяем результат метода
      return rezult;
  }           
}
public class SimpleDotTestDrive {
 public static void main(String[]arqs){
     // Создаем экземплр класса SimpleDotCom
     SimpleDotCom dot = new SimpleDotCom();
     // Создаем массив для место расположения "сайта"(три последовательных числа из семи)
     int[] locations= {2,3,4};
     // Вызываем сеттер сайта 
     dot.setLocationCells(locations);
     //Делаем ход от имени пользователя
     String userGuess = "2";
     //Вызываем метод checkYourSlef  обьекта SimpleDotCom
     String rezult = dot.checkYourSlef(userGuess);
     
 }
}
