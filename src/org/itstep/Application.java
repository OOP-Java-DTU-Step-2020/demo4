package org.itstep;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Циклы
        // Принципы: DRY, KISS, YAGNI, SOLID
        // DRY - Don`t repeat yourself

        // 1. while - цикл с предусловием
        int n = 0;
        while (n < 3) {
            System.out.println("Привет, Мир!");
            n++;
        }
        System.out.println("После цикла while: " + n);
        // 2. do..while - цикл с постусловием
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Сделать это");
            System.out.println("2. Сделать то");
            System.out.println("3. Выйти");
            System.out.print(">> ");
            n = 2; //scanner.nextInt();
        } while (n < 1 || n > 3);
        System.out.println("Ваш выбор: " + n);

        // 3. for - цикл со счетчиком
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // for each - применим для перебора элементов массива и итерируемых объектов

        // break - безусловное прекращение цикла
        n = 1;
        while (true) {
            System.out.println("Infinity loop");
            n++;
            if (n >= 5) {
                break;
            }
        }

        // continue - перейти к следующей итерации цикла
        for (int i = 1; i < 10; i+=2) {
            /*if (i % 2 == 0) {
                continue;
            }*/
            System.out.print(i + " ");
        }
        System.out.println();

        // Вывод таблицы умножения
        out:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if(i == 6) {
                    break out;
                }
                System.out.printf("%-4s", i*j);
            }
            System.out.println();
        }

        System.out.println("End of program");
    }
}
