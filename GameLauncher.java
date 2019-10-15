package gamelauncher;

      class GuessGame{
        Player p1;
        Player p2;
        Player p3;
    public void startGame(){
        p1=new Player();
        p2=new Player();
        p3=new Player();
    
        int quessp1 =0;
        int quessp2 =0;
        int quessp3 =0;
        
        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;
        
        int tangerNumber=(int)(Math.random()*20);
        System.out.println("Я загадываю число от 0 до 20......");
        
        while(true){
            System.out.println("Число которое нужно угодать - "+tangerNumber );
            p1.quess();
            p2.quess();
            p3.quess();
            
            quessp1 = p1.number;
            System.out.println("Превый игрок думает что это  " + quessp1);
            
            quessp2 = p2.number;
            System.out.println("Второй игрок думает что это  " + quessp2);
            
            quessp3 = p3.number;
            System.out.println("Третий  игрок думает что это  " + quessp3);
            if (quessp1 == tangerNumber){
                p1isRight = true; }
            if (quessp2 == tangerNumber){
                p2isRight = true; }
            if (quessp3 == tangerNumber){
                p3isRight = true; }
      if(p1isRight||p2isRight||p3isRight){
          System.out.println("У нас есть победтъитель");
          System.out.println("Первый игрок угодал? "+p1isRight);
          System.out.println("Второй игрок угодал? "+p2isRight);   
          System.out.println("Третий игрок угодал? "+p3isRight);
          System.out.println("Конец игры");
          break;
    }else{
          System.out.println("Игроки должы пробовать еще раз");}
       }
     }
   } 
 class Player{
    int number = 0;
    public void quess(){
        number = (int)(Math.random()*20);
        System.out.println("Думаю это число "+ number);
    }
}
 public class GameLauncher {
 public static void main(String[] args) {
     GuessGame game=new GuessGame();
     game.startGame();
    }
    
}
