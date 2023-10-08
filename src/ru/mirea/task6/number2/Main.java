package ru.mirea.task6.number2;

// Класс MovablePoint (как в предыдущем ответе)
interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
class MovablePoint implements Movable {
    private int x, y;
    private int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Реализация методов интерфейса Movable (moveUp, moveDown, moveLeft, moveRight)
    // ...

    public boolean hasSameSpeed(MovablePoint otherPoint) {
        return this.xSpeed == otherPoint.xSpeed && this.ySpeed == otherPoint.ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint(x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ")";
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}

// Класс MovableRectangle
class MovableRectangle implements Movable {
    private MovablePoint topLeft; // Верхний левый угол
    private MovablePoint bottomRight; // Нижний правый угол

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Реализация методов интерфейса Movable (moveUp, moveDown, moveLeft, moveRight)
    // ...

    public boolean hasSameSpeed() {
        return topLeft.hasSameSpeed(bottomRight);
    }

    @Override
    public String toString() {
        return "MovableRectangle(topLeft=" + topLeft + ", bottomRight=" + bottomRight + ")";
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем движущийся прямоугольник
        MovableRectangle rectangle = new MovableRectangle(1, 2, 5, 7, 2, 2);

        // Выводим информацию о прямоугольнике
        System.out.println("Исходный прямоугольник: " + rectangle);
        System.out.println("Прямоугольник имеет одинаковую скорость: " + rectangle.hasSameSpeed());

        // Перемещаем прямоугольник
        rectangle.moveUp();
        rectangle.moveRight();

        // Выводим информацию о прямоугольнике после перемещения
        System.out.println("После перемещения: " + rectangle);
        System.out.println("Прямоугольник имеет одинаковую скорость: " + rectangle.hasSameSpeed());
    }
}
