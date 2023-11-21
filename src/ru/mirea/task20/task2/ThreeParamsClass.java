package ru.mirea.task20.task2;

public class ThreeParamsClass<T, V, K> {
    private T firstParam;
    private V secondParam;
    private K thirdParam;

    public ThreeParamsClass(T firstParam, V secondParam, K thirdParam) {
        this.firstParam = firstParam;
        this.secondParam = secondParam;
        this.thirdParam = thirdParam;
    }

    public T getFirstParam() {
        return firstParam;
    }

    public V getSecondParam() {
        return secondParam;
    }

    public K getThirdParam() {
        return thirdParam;
    }

    public void displayClassNames() {
        System.out.println("Class of firstParam: " + firstParam.getClass().getName());
        System.out.println("Class of secondParam: " + secondParam.getClass().getName());
        System.out.println("Class of thirdParam: " + thirdParam.getClass().getName());
    }

    public static void main(String[] args) {
        ThreeParamsClass<String, Integer, Double> example = new ThreeParamsClass<>("Hello", 42, 3.14);

        System.out.println("Значения:");
        System.out.println("Первый параметр: " + example.getFirstParam());
        System.out.println("Второй параметр: " + example.getSecondParam());
        System.out.println("Третий параметр: " + example.getThirdParam());

        System.out.println("\nИмена классов:");
        example.displayClassNames();
    }
}

