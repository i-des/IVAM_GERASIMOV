package ru.mirea.task7.number1;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 2, 2);
        System.out.println(rectangle);

        rectangle.moveUp();
        System.out.println(rectangle);

        rectangle.moveRight();
        System.out.println(rectangle);
    }
}