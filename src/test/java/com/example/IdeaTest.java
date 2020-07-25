package com.example;

import static com.example.TestUtils.SUCCESS_STRING;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IdeaTest {

    @Test
    void shouldWorkAfterValueChange() {
        Assertions.assertEquals("success", SUCCESS_STRING);
    }

}
