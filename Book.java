
package tapedeck;

 class Book {
    String title;
    String author;
    
   }
class BooksDrive{
    public static void main(String[] arqs){
        Book[] MyBook = new Book[3];
        int x =0;
        MyBook[0]=new Book();
        MyBook[1]=new Book();
        MyBook[2]=new Book();
        
        MyBook[0].title=" Плоды джава";
        MyBook[1].title=" Плоды ";
        MyBook[2].title=" джава";
    
        MyBook[0].author=" боб";
        MyBook[1].author=" Синь";
        MyBook[2].author=" Ян";
        
        while (x<3){
            System.out.print(MyBook[x].title);
            System.out.print(", автор");
            System.out.print(MyBook[x].author);
            x+=1;
        }
    }
}