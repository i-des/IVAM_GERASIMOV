package ru.mirea.task14.number4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text1 = "1+2+";
        String text2 = "6 / 5 - 2 * 9";

        // Проверка текста на наличие цифр без символа "+"
        boolean containsNumbersWithoutPlus1 = containsNumbersWithoutPlus(text1);
        boolean containsNumbersWithoutPlus2 = containsNumbersWithoutPlus(text2);

        System.out.println("Текст 1 содержит цифры без символа '+': " + containsNumbersWithoutPlus1);
        System.out.println("Текст 2 содержит цифры без символа '+': " + containsNumbersWithoutPlus2);
    }

    public static boolean containsNumbersWithoutPlus(String text) {
        // Регулярное выражение для поиска цифр без символа "+"
        Pattern pattern = Pattern.compile("\\b\\d+\\b(?!\\+)");
        Matcher matcher = pattern.matcher(text);

        return matcher.find();
    }
}

