package ru.mirea.task4.number4;

// Перечисление для марок компьютера
enum ComputerBrand {
    HP, Dell, Lenovo, Asus, Acer
}

// Класс, представляющий процессор компьютера
class Processor {
    private String model;
    private int speedInGHz;

    public Processor(String model, int speedInGHz) {
        this.model = model;
        this.speedInGHz = speedInGHz;
    }

    public String getModel() {
        return model;
    }

    public int getSpeedInGHz() {
        return speedInGHz;
    }

    public void overclock(int additionalSpeed) {
        speedInGHz += additionalSpeed;
    }
}

// Класс, представляющий оперативную память компьютера
class Memory {
    private int sizeInGB;
    private String type;

    public Memory(int sizeInGB, String type) {
        this.sizeInGB = sizeInGB;
        this.type = type;
    }

    public int getSizeInGB() {
        return sizeInGB;
    }

    public String getType() {
        return type;
    }
}

// Класс, представляющий монитор компьютера
class Monitor {
    private String model;
    private int screenSizeInInches;

    public Monitor(String model, int screenSizeInInches) {
        this.model = model;
        this.screenSizeInInches = screenSizeInInches;
    }

    public String getModel() {
        return model;
    }

    public int getScreenSizeInInches() {
        return screenSizeInInches;
    }
}

// Класс, представляющий компьютер
class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public ComputerBrand getBrand() {
        return brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void turnOn() {
        System.out.println(brand + " компьютер включен.");
    }

    public void turnOff() {
        System.out.println(brand + " компьютер выключен.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты для компьютерных компонентов
        Processor processor = new Processor("Intel Core i7", 3);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell Ultrasharp", 27);

        // Создаем компьютер
        Computer myComputer = new Computer(ComputerBrand.Asus, processor, memory, monitor);

        // Включаем компьютер
        myComputer.turnOn();

        // Выводим информацию о компьютере
        System.out.println("Модель процессора: " + myComputer.getProcessor().getModel());
        System.out.println("Скорость процессора: " + myComputer.getProcessor().getSpeedInGHz() + " GHz");
        System.out.println("Объем памяти: " + myComputer.getMemory().getSizeInGB() + " GB");
        System.out.println("Тип памяти: " + myComputer.getMemory().getType());
        System.out.println("Модель монитора: " + myComputer.getMonitor().getModel());
        System.out.println("Размер экрана: " + myComputer.getMonitor().getScreenSizeInInches() + " inches");

        // Выключаем компьютер
        myComputer.turnOff();
    }
}
