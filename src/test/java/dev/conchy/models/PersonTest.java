package dev.conchy.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person(52, 1.57);
    }

    @Test
    void testGetHeight() {
        assertEquals(person.getHeight(), (1.57));
    }

    @Test
    void testGetWeight() {
        assertEquals(person.getWeight(), (52));
    }

    @Test
    void testSetHeight() {
        person.setHeight(1.60);
        assertEquals(person.getHeight(), (1.60));
    }

    @Test
    void testSetWeight() {
        person.setWeight(60);
        assertEquals(person.getWeight(), (60));
    }
}

