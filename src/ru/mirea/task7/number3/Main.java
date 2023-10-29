package ru.mirea.task7.number3;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
    String toString();
}

class MovablePoint implements Movable {
    int x, y;
    int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint: (" + x + ", " + y + ")";
    }

    public boolean SpeedTest(MovablePoint otherPoint) {
        // Проверка на одинаковое изменение координат
        return xSpeed == otherPoint.xSpeed && ySpeed == otherPoint.ySpeed;
    }
}

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public String toString() {
        return "MovableRectangle:\nTopLeft: " + topLeft + "\nBottomRight: " + bottomRight;
    }

    public boolean SpeedTest(MovableRectangle otherRectangle) {
        // Проверка скорости двух точек в прямоугольнике
        return topLeft.SpeedTest(otherRectangle.topLeft) && bottomRight.SpeedTest(otherRectangle.bottomRight);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем две точки с координатами и скоростью
        MovablePoint point1 = new MovablePoint(1, 2, 3, 4);
        MovablePoint point2 = new MovablePoint(5, 6, 3, 4);

        // Выводим начальные координаты точек
        System.out.println(point1);
        System.out.println(point2);

        // Перемещаем точки
        point1.moveUp();
        point2.moveDown();
        point1.moveRight();
        point2.moveLeft();

        // Выводим обновленные координаты точек
        System.out.println(point1);
        System.out.println(point2);

        // Создаем два прямоугольника с координатами и скоростью точек
        MovableRectangle rectangle1 = new MovableRectangle(0, 0, 2, 2, 1, 1);
        MovableRectangle rectangle2 = new MovableRectangle(3, 3, 5, 5, 1, 1);

        // Выводим начальные координаты прямоугольников
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        // Перемещаем прямоугольники
        rectangle1.moveUp();
        rectangle2.moveDown();
        rectangle1.moveRight();
        rectangle2.moveLeft();

        // Выводим обновленные координаты прямоугольников
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        // Проверка скорости точек в прямоугольниках
        boolean areSpeedsEqual = rectangle1.SpeedTest(rectangle2);
        if (areSpeedsEqual) {
            System.out.println("Скорости точек в прямоугольниках одинаковы.");
        } else {
            System.out.println("Скорости точек в прямоугольниках разные.");
        }
    }
}