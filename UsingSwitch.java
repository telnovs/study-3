import javax.swing.*;

/**
 *
 * @author PC-serg
 */
public class UsingSwitch {
    public static void main(String [] arqs){
        //Вводимое пользователем число :
        int num;
        // Текст из поля ввода и текст сообщения :
        String text, str;
        // Отобращение окна и считывание текста :
        text=JOptionPane.showInputDialog("Введите целое чило от 0 до 10");
        // Преобразование текста в число:
        num=Integer.parseInt(text);
        // Оператор выбора :
        switch (num){
            case 0:
                str="Вы ввели нуливое значение";
                break;
            case 1:
                str= "Вы ввели единичное значение";
                break;
            case 2:
            case 3:
            case 5:
            case 7: 
                str="Вы ввели простое значение";
                break;
            case 4:
            case 6:    
            case 8:
            case 10:
                str="Вы ввели четное число";
                break;
            default:
            str="Вы ввели чило 9\n или число выходящие за приделы диапазона";
          }
        JOptionPane.showMessageDialog(null,str);
        
        
    } 
    
}
