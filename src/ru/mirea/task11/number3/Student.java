package ru.mirea.task11.number3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


    public class Student {
        private String name;
        private int age;
        private Date birthDate;

        public Student(String name, int age, Date birthDate) {
            this.name = name;
            this.age = age;
            this.birthDate = birthDate;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        // Метод для получения строки даты рождения в заданном формате
        public String getFormattedBirthDate(String format) {
            SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            return dateFormat.format(birthDate);
        }

        @Override
        public String toString() {
            return "Student Name: " + name + "\n" +
                    "Age: " + age + "\n" +
                    "Birth Date: " + getFormattedBirthDate("dd.MM.yyyy"); // Здесь используется формат "дд.ММ.гггг"
        }

        public static void main(String[] args) throws ParseException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            Date birthDate = dateFormat.parse("27.08.2004"); // Здесь должна быть установлена фактическая дата рождения
            Student student = new Student("Иван", 19, birthDate);

            System.out.println(student);
            System.out.println("Birth Date (Short Format): " + student.getFormattedBirthDate("dd.MM.yy"));
            System.out.println("Birth Date (Medium Format): " + student.getFormattedBirthDate("dd MMM yyyy"));
            System.out.println("Birth Date (Full Format): " + student.getFormattedBirthDate("dd MMMM yyyy"));
        }
    }

