import javax.swing.*;

public class UsingVar{
    public static void main(String [] arqs ){
        String name= "Ивеноа иван иванович";
        int  age = 60;
        char categry = 'В';
        String text = "Driver:"+ name ;
        text = text+"\n"+"Возраст "+age+" лет";
        text = text +'\n'+ "Права категории "+categry;
        JOptionPane.showMessageDialog(null,text);
        
        
    }

}

