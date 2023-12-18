package ru.mirea.task29.number2;

public class Dish implements Item {
    private String name;
    private String type;

    public Dish(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public double getCost() {
        // Вернуть стоимость блюда
        return 0.0;
    }

    @Override
    public String getDescription() {
        // Вернуть описание блюда
        return type;
    }
}
