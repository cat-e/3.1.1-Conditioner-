package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {
    @Test
    void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }
    @Test
    void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(23);
        conditioner.increaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }


    @Test
    void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(16);
        conditioner.setCurrentTemperature(23);
        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }
}