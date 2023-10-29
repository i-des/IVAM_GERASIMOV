package ru.mirea.task11.number2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
        public static void main(String[] args) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            Date currentDate = new Date(); // Текущая дата и время
            String userInput = "27-10-2023 15:30:00"; // Здесь можно ввести дату в формате "гггг-ММ-дд HH:mm:ss"

            try {
                Date userDate = dateFormat.parse(userInput);

                if (currentDate.before(userDate)) {
                    System.out.println("Текущая дата и время меньше введенной даты.");
                } else if (currentDate.after(userDate)) {
                    System.out.println("Текущая дата и время больше введенной даты.");
                } else {
                    System.out.println("Текущая дата и время равны введенной дате.");
                }
            } catch (ParseException e) {
                System.out.println("Ошибка при парсинге введенной даты.");
            }
        }

}
