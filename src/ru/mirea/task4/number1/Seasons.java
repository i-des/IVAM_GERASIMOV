package ru.mirea.task4.number1;

public class Seasons {
    // Определение перечисления с названиями времен года
    enum Season {
        Весна("прохладное", "Холодное время года"),
        Лето("теплое", "Теплое время года"),
        Осень("прохладное", "Холодное время года"),
        Зима("холодное", "Холодное время года");

        private String averageTemperature;
        private String description;

        // Конструктор для установки средней температуры и описания времени года
        Season(String averageTemperature, String description) {
            this.averageTemperature = averageTemperature;
            this.description = description;
        }

        // Метод для получения средней температуры
        public String getAverageTemperature() {
            return averageTemperature;
        }

        // Метод для получения описания времени года
        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        // Создаем переменную, содержащую ваше любимое время года
        Season favoriteSeason = Season.Лето;

        // Распечатываем всю информацию о вашем любимом времени года
        System.out.println("Мое любимое время года - " + favoriteSeason + ".");
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        // Вывод информации о каждом времени года
        for (Season season : Season.values()) {
            System.out.println(season + ":");
            System.out.println("Средняя температура: " + season.getAverageTemperature());
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}
