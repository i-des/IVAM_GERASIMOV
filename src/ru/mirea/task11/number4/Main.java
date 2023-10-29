package ru.mirea.task11.number4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите дату в формате ДД.ММ.ГГГГ (например, 15.10.2023): ");
            String dateInput = scanner.nextLine();

            System.out.print("Введите время в формате ЧЧ.ММ (например, 14.30): ");
            String timeInput = scanner.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyyHH.mm");
            Date date = dateFormat.parse(dateInput + timeInput);

            // Создаем Calendar и устанавливаем его на указанную дату
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            // Выводим объекты Date и Calendar
            System.out.println("Созданный объект Date: " + date);
            System.out.println("Созданный объект Calendar: " + calendar.getTime());
        } catch (ParseException e) {
            System.err.println("Ошибка ввода. Убедитесь, что вы используете правильные форматы даты и времени.");
        }
    }
}

