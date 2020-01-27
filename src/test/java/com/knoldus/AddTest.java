package com.knoldus;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AddTest {

    private static Add add;
    
    @BeforeClass
    public static void setUp() {
        add = new Add();
    }
    
    // Only positive test case is there for now.
    @Test
    public void shouldAddTwoNumbers() {
        int actualResult = add.addTwoNumbers(45,45);
        int expectedResult = 90;
        assertThat(actualResult, is(equalTo(expectedResult)));
    }
}
