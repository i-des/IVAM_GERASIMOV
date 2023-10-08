package ru.mirea.task6.number4;

// Интерфейс Priceable
interface Priceable {
    double getPrice();
}

// Класс, представляющий продукт
class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Класс, представляющий автомобиль
class Car implements Priceable {
    private String brand;
    private double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

// Класс, представляющий недвижимость
class RealEstate implements Priceable {
    private String location;
    private double price;

    public RealEstate(String location, double price) {
        this.location = location;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты разных классов, реализующих интерфейс Priceable
        Priceable product = new Product("Ноутбук", 999.99);
        Priceable car = new Car("Porsche 911", 154605.00);
        Priceable realEstate = new RealEstate("Манхэттен, Нью-Йорк", 1000000.00);

        // Вызываем метод getPrice() для получения цен объектов
        System.out.println("Цена продукта: $" + product.getPrice());
        System.out.println("Цена автомобиля: $" + car.getPrice());
        System.out.println("Цена недвижимости: $" + realEstate.getPrice());
    }
}
