package ru.mirea.parenthesis_matching;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // Нет открывающей скобки для закрывающей
                }

                char openBracket = stack.pop();
                if ((ch == ')' && openBracket != '(') ||
                        (ch == '}' && openBracket != '{') ||
                        (ch == ']' && openBracket != '[')) {
                    return false; // Несоответствие типов скобок
                }
            }
        }

        return stack.isEmpty(); // В конце все открывающие скобки должны быть закрыты
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String exp1 = sc.next();
//        String exp2 = sc.next();

        System.out.println(isBalanced(exp1)); // Вывод: true
//        System.out.println(isBalanced(exp2)); // Вывод: false
    }
}
