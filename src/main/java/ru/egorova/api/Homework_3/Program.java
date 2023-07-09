/*
 * Пусть дан произвольный список целых чисел.

1) Нужно удалить из него чётные числа
2) Найти минимальное значение
3) Найти максимальное значение
4) Найти среднее значение
 */

package ru.egorova.api.Homework_3;

import java.util.*;


public class Program {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        boolean f = true;
        while(f){
            System.out.println("Введите номер подзадачи: ");
            System.out.println("1 - Удаление четных чисел из списка");
            System.out.println("2 - Минимальное значение");
            System.out.println("3 - Максимальное значение");
            System.out.println("4 - Среднее значение");
            System.out.println("0 - Выход из программы.");
            System.out.println("**************************************");


            int no = Integer.parseInt(scanner.nextLine());
            ArrayList<Integer> arrayList = masInteger();

            switch(no){
                case 1:
                    System.out.println("Список целых чисел\n" + arrayList);
                    task1(arrayList);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Список целых чисел\n" + arrayList);
                    System.out.println("Минимальное значение: " + Collections.min(arrayList));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Список целых чисел\n" + arrayList);
                    System.out.println("Максимальное значение: " + Collections.max(arrayList));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Список целых чисел\n" + arrayList);
                    System.out.println("Среднее значение: " + task4(arrayList));
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Завершение работы приложения");
                    f = false;
                    break;
                default:
                    System.out.println("Вы указали некорректный номер задачи.\nПовторите попытку ввода. ");
                    break;
            }
        }
    }

    static ArrayList<Integer> masInteger(){
        int size = random.nextInt(7, 10);
        ArrayList<Integer> masInteger = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            masInteger.add(random.nextInt(0, 11));
        }
        return masInteger;
    }
    static  void  task1(ArrayList<Integer> arrayList){
        for (int i=arrayList.size()-1; i >= 0; i--) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        }
        System.out.println("Остаток после удаления чётных: " + arrayList);
    }


    static  Double  task4(ArrayList<Integer> arrayList){
        int Sum = 0;
        Double Sr;
        for (int i=0; i < arrayList.size(); i++){
             Sum += arrayList.get(i);
        }
        System.out.println("Сумма элементов = " + Sum);
        System.out.println("Количество элементов = " + arrayList.size());
        Sr = (double)Sum/(double)arrayList.size();
        return Sr;
    }

}

/*
public class Program{
    static Random random = new Random();
    public static void main(String[] args) {
        task1();
    }
        static  void  task1(){
            int size = random.nextInt(7, 10);
            ArrayList<Integer> arrayList= new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(random.nextInt(0, 11));
            }
            System.out.println("Список целых чисел\n" + arrayList);
            System.out.println("Минимальное значение: " + Collections.min(arrayList));
            System.out.println("Максимальное значение: " + Collections.max(arrayList));
            int Sum = 0;
            Double Sr;
            for (int i=0; i <arrayList.size(); i++){
                Sum += arrayList.get(i);
                }
            System.out.println("Сумма элементов = " + Sum);
            System.out.println("Количество элементов = " + arrayList.size());
            Sr = (double)Sum/(double)arrayList.size();
            System.out.println("Среднее значение: " + Sr);

            for (int i=arrayList.size()-1; i >= 0; i--) {
                if (arrayList.get(i) % 2 == 0) {
                    arrayList.remove(i);
                }
            }
            System.out.println("Остаток после удаления чётных: " + arrayList);


        }
}

*/

