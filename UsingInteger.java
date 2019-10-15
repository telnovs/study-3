import javax.swing.*;
public class UsingInteger{
    public static void main(String [] arqs){
        int Namber=321;
        String NotAnNamber="123";
        int AnNamber=Integer.parseInt(NotAnNamber);
        String title1="Команда Namber+NotAnNamber";
        String title2="Команда Namber+AnNamber";
        int type1=JOptionPane.ERROR_MESSAGE;
        int type2=JOptionPane.WARNING_MESSAGE;
        JOptionPane.showMessageDialog(null,Namber+NotAnNamber,title1,type1);
        JOptionPane.showMessageDialog(null,Namber+AnNamber,title2,type2);
    } 
}