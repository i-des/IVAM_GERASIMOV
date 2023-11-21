package ru.mirea.task20.task1;

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

    public void setFirstParam(T firstParam) {
        this.firstParam = firstParam;
    }

    public V getSecondParam() {
        return secondParam;
    }

    public void setSecondParam(V secondParam) {
        this.secondParam = secondParam;
    }

    public K getThirdParam() {
        return thirdParam;
    }

    public void setThirdParam(K thirdParam) {
        this.thirdParam = thirdParam;
    }

    public void display() {
        System.out.println("Первый параметр: " + firstParam);
        System.out.println("Второй параметр: " + secondParam);
        System.out.println("Третий параметр: " + thirdParam);
    }

    public static void main(String[] args) {
        ThreeParamsClass<String, Integer, Double> example = new ThreeParamsClass<>("Hello", 42, 3.14);
        example.display();
    }
}
