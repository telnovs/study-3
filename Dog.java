

package tapedeck;


public class Dog {
    String name;
public static void main (String [] aqrs){
    int  u =1;
    Dog dog1= new Dog();
    dog1.dark();
    dog1.name=" Бард ";
    
    Dog[] myDogs = new Dog [3];
    myDogs[0]= new Dog();
    myDogs[1]= new Dog();
    myDogs[2]= dog1;
    
    myDogs[0].name=" Фред ";
    myDogs[1].name=" Джоржд ";
    
    System.out.print(" Имя последний собаки ");
    System.out.println(myDogs[2].name);  
    int x=0;
    
    while (x<myDogs.length){
    myDogs[x].dark();
    x+=1;}
    
}
public void dark(){
    System.out.println(name+ " Сказал Гав!!! ");
}
public void eat (){}
public void chaseCat(){}
}


