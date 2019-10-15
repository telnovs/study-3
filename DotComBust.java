
package dotcombust;
import java.util.*;
import java.io.*;
/**
 *
 * @author PC-serg
 */
public class DotComBust {

    /**
     * обьевляем и инцилизируем переменные которые нам понадобяться 
     */
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;
    
    private void setUpGame(){
        // Создаем несколько сайтов  и  и присваеваем им адреса 
        //Создаем 3 обьекта DotCom даем им имена и  помещаем  в ArryList
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);
        // выводим краткие инструкции для пользователя 
        System.out.println("Ваше цель потопить 3 сайта ");
        System.out.println("Pets.com, eToys.com,Go2.com ");
        System.out.println("ПОСТАРАЙТЕСЬ потопить их за меньшее количество ходов ");
         // Повторяем с каждым обьектом Dotcom в списке 
        for (DotCom dotComToSet:dotComsList){
            //Запрашиваем у вспомогательного обьекта адрес сайта
            ArrayList<String> newLocation = helper.placeDotCom(3);
           /*
            Вызываем сеттор из обьекта DotCom Чтобы передать ему 
            местоположенние которое от только что получил от вспомогательного
            обьекта
            */
            dotComToSet.setLocationCells(newLocation);
        }
    }
    private void startPlaying(){
        //До тех пор пока список обьектов DotCom не станет пустым  
    while(!dotComsList.isEmpty()){
        // Получаем пользавтельский ввод
        String userGuess = helper.getUserInput("Сделайте ход");
        checkUserGuees(userGuess);  //Вызывает наш метод    checkUserGuees   
    }
    finishGame();//Вызывает наш метод finishGame
    }
    private void checkUserGuees(String userGuess){
        // Инкремеруем кол-во попыток которое сделал пользователь
        numOfGuesses++;
        // показываем промах пока не выяснили  братное
       String result = "Мимо";
       //Повторяем  ютодля всех обьектом Dotcom в списке
       for (DotCom dotComToTest : dotComsList){
        //ПРосим DotCom проверить ход пользовател 
         //ищем попадание (или потопил)
        result = dotComToTest.checkYourSlef(userGuess) ;   
     if (result.equals("Попал")){
         break;// выходим из раньше времени,смысла проверять другие сайты нет
     }  
      if (result.equals("Потопил")){
         // Если пришел коне то удаляем его из списаков 
         dotComsList.remove(dotComToTest);
         break;
      }
     }
       System.out.println(result);
    }
    private void finishGame(){
        // Выводим сообщение о том как пользователь прошел игру
    System.out.println ("Все сайти ушли ко дну. Ваши акции не чего не стоят ");
    if (numOfGuesses <= 18){
       System.out.println("Это заняло у вас "+ numOfGuesses + "попыток "); 
       System.out.println("вы успелт выбряться до того как выши вложения утонули");
    }else{
        System.out.println("Это заняло у вас очень много "+ numOfGuesses +" Попыток "); 
        System.out.println("Рыбы водят хорводы вокруг ваших вложений"); 
         }
    }
    
    public static void main(String[] args) {
        // Создаем игровой обьект 
        DotComBust game = new DotComBust();
        //Говорим игровому обькту подготовить игру 
        game.setUpGame();
        /*Говорим игровому обьекту начать главный игровой цикл
        (Продолжаем запрашивать пользовательский вводт проверяем получченные данные 
        */
        game.startPlaying();
    }
   }
