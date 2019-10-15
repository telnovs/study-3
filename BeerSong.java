
package beersong;

public class BeerSong {
  public static void main(String[] args) {
       int sum = 0;
       sum = 2<<4;
      System.out.println(sum); 
      int BeerNum=2;
      String word=" Бутылок ";
      while (BeerNum > 0){
          if (BeerNum==1){
              word="Бутылка ";}
          System.out.println(BeerNum+" "+word+" пиво а стене");
          System.out.println(BeerNum+" "+word+" пива ");
          System.out.println("Возьми одну");
          System.out.println("Пусти по кругу");
         BeerNum-=1;
          if(BeerNum>0){
              System.out.println(BeerNum+" "+word+"пиво а стене");
      } else{
              System.out.println("Нет бутылок на стене");
          } 
    }
  }
}
