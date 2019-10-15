import javax.swing.*;
public class CharArray { 
    public static void main(String[] args) {
        // Размер масива (количество строк) - случайное число о 2 до 4
        int size=2+(int)(Math.random()*3);
 //переменная для записи количества элементов строке массива 
        int n;
        // Начальная буква для элемента заполнения массива 
        char s='a';
        //Текст для отображения в окне 
        String  text="\"рваный\"символьный массив ";
        // Создование массива заданое количество строк
        char[][] symbs=new char[size][];
        // Добавление строк в массив 
        for(int k=0;k<size;k++){
            //Случайное число от 1 до 8 
            n=1+(int)(Math.random()*8);
            //Создание длинной строки
            symbs[k]=new char [n];}
        //Заполнение массива буквами 
        for (int i=0;i<symbs.length;i++){
            // Переход на новую строку  и символ вертикальной черты 
            text+="\n| ";
            for (int j=0;j<symbs[i].length;j++){
                // Заполнение элемента символом
               symbs [i] [j]=s;
               s++;
               //Добовление записи в текст 
               text+=symbs[i][j]+" | "; }
                       }
        JOptionPane.showMessageDialog(null,text);
    
    }   
}
