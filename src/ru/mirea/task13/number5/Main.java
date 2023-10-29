package ru.mirea.task13.number5;

public class Main {
    public static String formatPhoneNumber(String phoneNumber) {
        // Убираем все символы, кроме цифр
        phoneNumber = phoneNumber.replaceAll("\\D", "");

        if (phoneNumber.length() == 11 && phoneNumber.startsWith("8")) {
            // Для российских номеров в формате "8XXXXXXXXXX"
            phoneNumber = "+7" + phoneNumber.substring(1);
        } else if (phoneNumber.length() == 12 && phoneNumber.startsWith("+")) {
            // Для международных номеров в формате "+XXXXXXXXXXX"
            phoneNumber = "+" + phoneNumber.substring(1);
        }

        // Проверяем, что получили строку с 11 цифрами
        if (phoneNumber.length() == 11) {
            // Форматируем номер
            return phoneNumber.replaceFirst("(\\d{1})(\\d{3})(\\d{3})(\\d{4})", "+$1$2-$3-$4");
        }

        // В случае некорректного формата возвращаем исходную строку
        return phoneNumber;
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        System.out.println("Formatted Phone Number 1: " + formatPhoneNumber(phoneNumber1)); // +7 917-565-5655
        System.out.println("Formatted Phone Number 2: " + formatPhoneNumber(phoneNumber2)); // +1 042-896-52211 (не соответствует формату)
        System.out.println("Formatted Phone Number 3: " + formatPhoneNumber(phoneNumber3)); // +7 917-565-5655
    }
}

