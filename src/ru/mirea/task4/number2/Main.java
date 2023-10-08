package ru.mirea.task4.number2;

// Определение перечисления с размерами одежды
enum ClothingSize {
    XXS(32), XS(34), S(36), M(38), L(40);

    private int euroSize;

    // Конструктор для установки euroSize
    ClothingSize(int euroSize) {
        this.euroSize = euroSize;
    }

    // Метод для получения описания размера
    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }

    // Метод для получения euroSize
    public int getEuroSize() {
        return euroSize;
    }
}

// Интерфейс для мужской одежды
interface MenClothing {
    void dressMan();
}

// Интерфейс для женской одежды
interface WomenClothing {
    void dressWomen();
}

// Абстрактный класс Одежда
abstract class Clothes {
    private ClothingSize size;
    private double cost;
    private String color;

    public Clothes(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}

// Класс Футболка
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в футболку: размер " + getSize() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро.");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в футболку: размер " + getSize() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро.");
    }
}

// Класс Штаны
class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в штаны: размер " + getSize() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро.");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в штаны: размер " + getSize() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро.");
    }
}

// Класс Юбка
class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в юбку: размер " + getSize() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро.");
    }
}

// Класс Галстук
class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в галстук: размер " + getSize() + ", цвет " + getColor() + ", стоимость " + getCost() + " евро.");
    }
}

// Класс Ателье
class Atelier {
    public static void dressWomen(WomenClothing[] clothes) {
        System.out.println("Женская одежда в ателье:");
        for (WomenClothing clothing : clothes) {
            clothing.dressWomen();
        }
    }

    public static void dressMan(MenClothing[] clothes) {
        System.out.println("Мужская одежда в ателье:");
        for (MenClothing clothing : clothes) {
            clothing.dressMan();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем массив, содержащий разные типы одежды
        MenClothing[] menClothes = {
                new TShirt(ClothingSize.M, 19.99, "Белый"),
                new Pants(ClothingSize.L, 39.99, "Черный"),
                new Tie(ClothingSize.XXS, 9.99, "Красный")
        };

        WomenClothing[] womenClothes = {
                new TShirt(ClothingSize.S, 24.99, "Розовый"),
                new Skirt(ClothingSize.S, 29.99, "Синий")
        };

        // Вывод информации о женской одежде
        Atelier.dressWomen(womenClothes);

        // Вывод информации о мужской одежде
        Atelier.dressMan(menClothes);
    }
}
