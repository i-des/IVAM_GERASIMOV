package ru.mirea.task13.number1;

public class Main {
    public static void main(String[] args) {
        String inputString = "I like Java!!!";

        // 2. Распечатать последний символ строки.
        char lastChar = inputString.charAt(inputString.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        // 3. Проверить, заканчивается ли строка подстрокой "!!!".
        boolean endsWithExclamation = inputString.endsWith("!!!");
        System.out.println("Строка заканчивается на '!!!': " + endsWithExclamation);

        // 4. Проверить, начинается ли строка подстрокой "I like".
        boolean startsWithILike = inputString.startsWith("I like");
        System.out.println("Строка начинается с 'I like': " + startsWithILike);

        // 5. Проверить, содержит ли строка подстроку "Java".
        boolean containsJava = inputString.contains("Java");
        System.out.println("Строка содержит 'Java': " + containsJava);

        // 6. Найти позицию подстроки "Java" в строке "I like Java!!!".
        int javaIndex = inputString.indexOf("Java");
        System.out.println("Позиция 'Java' в строке: " + javaIndex);

        // 7. Заменить все символы "а" на "о".
        String replacedString = inputString.replace("a", "o");
        System.out.println("Строка после замены: " + replacedString);

        // 8. Преобразовать строку в верхний регистр.
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseString);

        // 9. Преобразовать строку в нижний регистр.
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseString);

        // 10. Вырезать подстроку "Java" с помощью метода String.substring().
        String extractedString = inputString.substring(7, 11); // Извлекаем "Java"
        System.out.println("Извлеченная подстрока: " + extractedString);
    }
}

