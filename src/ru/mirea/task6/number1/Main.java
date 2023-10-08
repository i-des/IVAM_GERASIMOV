package ru.mirea.task6.number1;

// Интерфейс Movable
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

// Класс MovablePoint, реализующий интерфейс Movable
class MovablePoint implements Movable {
    private int x, y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public String toString() {
        return "MovablePoint(x=" + x + ", y=" + y + ")";
    }
}

// Класс MovableCircle, реализующий интерфейс Movable
class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int radius) {
        this.center = new MovablePoint(x, y);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public String toString() {
        return "MovableCircle(center=" + center + ", radius=" + radius + ")";
    }
}

public class Main {
    public static void main(String[] args) {
        // Пример использования MovablePoint
        MovablePoint point = new MovablePoint(2, 3);
        System.out.println("Исходная точка: " + point);
        point.moveUp();
        System.out.println("После перемещения вверх: " + point);

        // Пример использования MovableCircle
        MovableCircle circle = new MovableCircle(1, 1, 2);
        System.out.println("Исходный круг: " + circle);
        circle.moveRight();
        System.out.println("После перемещения вправо: " + circle);
    }
}
