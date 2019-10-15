class Dog{
    int size;
    String name;
    void bark(int numOfbarks){
        if (size>60){
               System.out.println("Гав  гав !!!");}
        else if(size>14){
            System.out.println("Тяф   Тяф !!!");
        }
        else{
        System.out.println("Вув  Вув !!!");
        
    }
        
        while (numOfbarks>0){
            System.out.println("Дай");
           numOfbarks-=1;

        }
    }
    class TestStuff{
    void go(){
       TestStuff t = new TestStuff();
       t.takeTwo(12,34);
        }
    void takeTwo(int x, int y){
        int z= x+y;
        System.out.println("Суммма равна  " + z);
    }
   }        
}

public class DogTestDrive {
public static void main(String[] arqs){
  
  
    
    Dog one = new Dog();
    one.size= 70;
    Dog two = new Dog();
    two.size= 8;
    Dog fhree = new Dog();
    fhree.size= 35;
    Dog eg = new Dog(); 
    one.bark(1);
    two.bark(2);
    fhree.bark(3);
    
    
  
   
   
    
    
    
}    
}
