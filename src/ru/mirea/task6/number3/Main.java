package ru.mirea.task6.number3;

// Интерфейс Nameable
interface Nameable {
    String getName();
}

// Класс, представляющий планету
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

// Класс, представляющий машину
class Car implements Nameable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return brand;
    }
}

// Класс, представляющий животное
class Animal implements Nameable {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return species;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Nameable
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Porsche 911");
        Nameable animal = new Animal("Лев");

        // Вызываем метод getName() для получения имени объектов
        System.out.println("Имя планеты: " + planet.getName());
        System.out.println("Имя машины: " + car.getName());
        System.out.println("Имя животного: " + animal.getName());
    }
}