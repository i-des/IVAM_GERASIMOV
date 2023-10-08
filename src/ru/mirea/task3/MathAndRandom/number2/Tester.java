package ru.mirea.task3.MathAndRandom.number2;

import java.util.Arrays;
import java.util.Random;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив окружностей уже заполнен.");
        }
    }

    public Circle findSmallestCircle() {
        if (count == 0) {
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle findLargestCircle() {
        if (count == 0) {
            return null;
        }

        Circle largestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, 0, count, (circle1, circle2) -> Double.compare(circle1.getRadius(), circle2.getRadius()));
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);

        // Добавляем случайные окружности в массив
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            double x = random.nextDouble() * 10;
            double y = random.nextDouble() * 10;
            double radius = random.nextDouble() * 5;
            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }

        // Поиск и вывод информации о самой маленькой и самой большой окружности
        Circle smallestCircle = tester.findSmallestCircle();
        Circle largestCircle = tester.findLargestCircle();

        if (smallestCircle != null) {
            System.out.println("Самая маленькая окружность: Радиус = " + smallestCircle.getRadius() +
                    ", Центр = (" + smallestCircle.getCenter().getX() + ", " + smallestCircle.getCenter().getY() + ")");
        } else {
            System.out.println("Массив окружностей пуст.");
        }

        if (largestCircle != null) {
            System.out.println("Самая большая окружность: Радиус = " + largestCircle.getRadius() +
                    ", Центр = (" + largestCircle.getCenter().getX() + ", " + largestCircle.getCenter().getY() + ")");
        } else {
            System.out.println("Массив окружностей пуст.");
        }

        // Упорядочивание окружностей по радиусу
        tester.sortCirclesByRadius();
        System.out.println("Окружности после упорядочивания:");
        for (int i = 0; i < tester.count; i++) {
            Circle circle = tester.circles[i];
            System.out.println("Радиус = " + circle.getRadius() +
                    ", Центр = (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        }
    }
}
