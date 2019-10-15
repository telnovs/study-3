/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gooddogtestdive;

/**
 *Создаем клас  GoodDog с описаем метода 
 */
class GoodDog{
    // Создаем закрытую перепенну size типа интенжер 
    
     private int size;
    
     // создаем открутую поле и через это поле получаем доступ к закрытой переменной size 
     public int getSize(){
         return size;
     }
     //Создаем метод с доступом к пполю size
     public void setSize(int s ){
         size = s;
         }
     void bark(){
         if (size>60){
             System.out.println("Гав Гав!!");
        }else if (size>14){
            System.out.println("Вуф Вуф!!");
        }
        else {
            System.out.println("Тяф Тяф!!");
        }
     }
       
}
public class GoodDogTestDive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("Первая собака !!"+ one.getSize());
        System.out.println("Вторая собока !! "+ two.getSize());
        one.bark();
        two.bark();
        int pets;
        int[] Dog;
       
       
       
        
      
        
        
    }
    
}
