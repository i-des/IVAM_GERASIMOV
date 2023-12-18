package ru.mirea.task31.number2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    @Test
    public void testAddition() {
        MyMath myMath = new MyMath();
        int result = myMath.add(2, 3);
        assertEquals(5, result);
    }
}

