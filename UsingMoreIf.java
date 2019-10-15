import javax.swing.*;
public class UsingMoreIf {
    public static void main(String[] args) {
        /* Текствые переменные для вввода ползователя
        изаписи текста вводимого в диалоговом окне
        */
        String text, str;
        // Считывание текса (числа)введеного пользователем:
        text=JOptionPane.showInputDialog("Введите целое чило ");
        // Проверка коректности ввода :
        if(text==null){System.exit(0);}
        //оПРЕДЕЛЕНИЕ числа (преодразование тектс ав число ):
        int num=Integer.parseInt(text);
        //вложенные условные операторы:
        if(num<0){str="Вы ввели отрицательноае чило";}
        else if(num>100){str ="Вы ввели чило больше 100";}
        else if(num>10){str ="Вы выели число больше 10";}
        else {str="Вы ввели число от 0 до 10";}
        //Отображение диоллогово окна :
        JOptionPane.showMessageDialog(null, str);
    }
    
}
