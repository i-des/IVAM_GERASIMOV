package ru.mirea.task7.number1;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovableRectangle implements Movable {
    private int x1, y1, x2, y2;  // Координаты верхнего левого и нижнего правого углов прямоугольника

    public MovableRectangle(int x1, int y1, int x2, int y2) {
        if (x1 >= x2 || y1 >= y2) {
            throw new IllegalArgumentException("Неверные координаты прямоугольника.");
        }
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void moveUp() {
        y1--;
        y2--;
    }

    @Override
    public void moveDown() {
        y1++;
        y2++;
    }

    @Override
    public void moveLeft() {
        x1--;
        x2--;
    }

    @Override
    public void moveRight() {
        x1++;
        x2++;
    }

    @Override
    public String toString() {
        return "MovableRectangle: (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")";
    }
}
