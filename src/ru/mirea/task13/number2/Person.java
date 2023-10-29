package ru.mirea.task13.number2;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    // Метод для получения Фамилии И.О., учитывая возможное отсутствие Имени и Отчества
    public String getFullName() {
        StringBuilder fullNameBuilder = new StringBuilder(lastName);

        if (firstName != null && !firstName.isEmpty()) {
            fullNameBuilder.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.isEmpty()) {
            fullNameBuilder.append(" ").append(middleName.charAt(0)).append(".");
        }

        return fullNameBuilder.toString();
    }

    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        Person person2 = new Person("Петров", "Петр", "");
        Person person3 = new Person("Сидоров", "", "Сидорович");

        System.out.println("Person 1: " + person1.getFullName()); // Должно вывести "Иванов И.И."
        System.out.println("Person 2: " + person2.getFullName()); // Должно вывести "Петров П."
        System.out.println("Person 3: " + person3.getFullName()); // Должно вывести "Сидоров С."
    }
}
