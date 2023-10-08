package ru.mirea.task2.number5;

import java.util.Scanner;

public class NurseryDog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество собак: ");
        int n = sc.nextInt();
        Dog[] Dogs = new Dog[n];

        for (int i=0; i<n; i++){
            Dog dog = new Dog("",0);
            System.out.print("\n№" + (i+1));
            System.out.print(" Введите имя собаки: ");
            String name = sc.next();
            System.out.print("Введите возраст собаки: ");
            int age = sc.nextInt();
            dog.setName(name);
            dog.setAge(age);
            dog.setHumanage();
            Dogs[i] = dog;
        }

        System.out.println("\nВсе собаки:");
        for (int i = 0; i<n; i++){
            System.out.println(Dogs[i].toString());
        }
    }
}
