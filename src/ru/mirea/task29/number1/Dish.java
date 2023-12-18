package ru.mirea.task29.number1;

public class Dish {
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
}
