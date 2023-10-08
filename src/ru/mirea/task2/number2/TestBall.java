package ru.mirea.task2.number2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ball k1 = new Ball(0,0);
        System.out.print("Введите кординату x: ");
        int x1 = scan.nextInt();
        System.out.print("Введите кординату y: ");
        int y1 = scan.nextInt();
        k1.move(x1,y1);
        System.out.println(k1.toString());

        System.out.print("Введите кординату x: ");
        x1 = scan.nextInt();
        System.out.print("Введите кординату y: ");
        y1 = scan.nextInt();
        k1.move(x1,y1);
        System.out.println(k1.toString());

        System.out.print("Введите кординату x: ");
        x1 = scan.nextInt();
        System.out.print("Введите кординату y: ");
        y1 = scan.nextInt();
        k1.move(x1,y1);
        System.out.println(k1.toString());
    }
}
