package ru.mirea.task2.number1;

public class TestAuthor {
    public static void main(String[] args) {
        Author Ivan = new Author("Ivan", "ivan@gmail.com", 'm');

        System.out.println(Ivan.getName());

        System.out.println(Ivan.getEmail());

        Ivan.setEmail("i_g@gmail.com");

        System.out.println(Ivan.getGender());

        Ivan.setEmail("ivanomsk@gmail.com");
        System.out.println(Ivan.toString());
    }
}
