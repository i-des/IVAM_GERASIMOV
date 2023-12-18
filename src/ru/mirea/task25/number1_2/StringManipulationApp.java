
package ru.mirea.task25.number1_2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulationApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для манипуляций:");
        String inputString = scanner.nextLine();

        manipulateString(inputString);

        System.out.println("Введите строку для проверки (является ли строкой 'abcdefghijklmnopqrstuv18340'):");
        String checkString = scanner.nextLine();

        checkIfValidString(checkString);
    }

    private static void manipulateString(String inputString) {
        // Ваш код для манипуляций с строкой
        System.out.println("Результат манипуляций: " + inputString.toUpperCase());
    }

    private static void checkIfValidString(String checkString) {
        // Регулярное выражение для проверки строки
        String regex = "^[a-z0-9]{26}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(checkString);

        if (matcher.matches()) {
            System.out.println("Строка соответствует шаблону.");
        } else {
            System.out.println("Строка не соответствует шаблону.");
        }
    }
}
