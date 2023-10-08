package ru.mirea.task2.number9;

import java.util.Arrays;

public class Koloda {
    private int[] K; // Массив колоды
    private int n = 52; // Кол-во карт в колоде

    public String getCard(int x){ // Определение карты
        String card = "";
        int k = (int) x/13;
        if (k==0){
            card = " черви";
        }
        else if (k==1){
            card = " крести";
        }
        else if (k==2){
            card = " буби";
        }
        else if (k==3){
            card = " пики";
        }
        x -= k*13;
        if (x==0){
            card = "Двойка" + card;
        } else if (x==1){
            card = "Тройка" + card;
        } else if (x==2){
            card = "Четверка" + card;
        } else if (x==3){
            card = "Пятерка" + card;
        } else if (x==4){
            card = "Шестерка" + card;
        } else if (x==5){
            card = "Семерка" + card;
        } else if (x==6){
            card = "Восьмерка" + card;
        } else if (x==7){
            card = "Девятка" + card;
        } else if (x==8){
            card = "Десятка" + card;
        } else if (x==9){
            card = "Валет" + card;
        } else if (x==10){
            card = "Дама" + card;
        } else if (x==11){
            card = "Король" + card;
        } else if (x==12){
            card = "Туз" + card;
        }
        return card;
    }

    public Koloda(int[] k) {
        K = k;
    }

    public int[] getK() {
        return K;
    }

    public void setK(int[] k) {
        K = k;
    }

    @Override
    public String toString() {
        return "Koloda{" +
                "K=" + Arrays.toString(K) +
                '}';
    }
}
