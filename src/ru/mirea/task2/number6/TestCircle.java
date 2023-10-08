package ru.mirea.task2.number6;

import java.util.Scanner;

public class TestCircle {
    public static void Sravni(Circle N1, Circle N2){
        if (N1.getR() > N2.getR()){
            System.out.println("Первый круг больше второго");
        } else {
            System.out.println("Второй круг больше первого");
        }
    }
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        Circle Circle1 = new Circle(3.1, 4.1, 5.1, "red");
        Circle Circle2 = new Circle(0, 0, 3, "white");
        Sravni(Circle1, Circle2);
        Circle1.setR(2);
        Sravni(Circle1, Circle2);
    }
}
