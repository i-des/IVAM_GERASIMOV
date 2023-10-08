package ru.mirea.task2.number5;

public class Dog {
    private String name;
    private int age;
    private int humanage;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        humanage = age*7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHumanage() {
        return humanage;
    }

    public void setHumanage() {
        humanage = age*7;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", humanage=" + humanage +
                '}';
    }
}
