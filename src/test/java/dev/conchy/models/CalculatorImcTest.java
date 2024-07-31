package dev.conchy.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CalculatorImcTest {

    @Test
    public void testDelgadezSevera() {
        Person person = new Person(40, 1.70);
        CalculatorImc calculator = new CalculatorImc(person);
        assertEquals("Esta persona tiene delgadez severa.", calculator.getImcCategory());
    }

    @Test
    public void testDelgadezModerada() {
        Person person = new Person(50, 1.75);
        CalculatorImc calculator = new CalculatorImc(person);
        assertEquals("Esta persona tiene delgadez moderada.", calculator.getImcCategory());
    }

    @Test
    public void testDelgadezLeve() {
        Person person = new Person(55, 1.75);
        CalculatorImc calculator = new CalculatorImc(person);
        assertEquals("Esta persona tiene delgadez leve.", calculator.getImcCategory());
    }

    @Test
    public void testPesoNormal() {
        Person person = new Person(68, 1.75);
        CalculatorImc calculator = new CalculatorImc(person);
        assertEquals("Esta persona tiene un peso normal.", calculator.getImcCategory());
    }

    @Test
    public void testSobrepeso() {
        Person person = new Person(80, 1.75);
        CalculatorImc calculator = new CalculatorImc(person);
        assertEquals("Esta persona tiene sobrepeso.", calculator.getImcCategory());
    }

    @Test
    public void testObesidadLeve() {
        Person person = new Person(95, 1.75);
        CalculatorImc calculator = new CalculatorImc(person);
        assertEquals("Esta persona tiene obesidad leve.", calculator.getImcCategory());
    }

    @Test
    public void testObesidadMedia() {
        Person person = new Person(110, 1.75);
        CalculatorImc calculator = new CalculatorImc(person);
        assertEquals("Esta persona tiene obesidad media.", calculator.getImcCategory());
    }

    @Test
    public void testObesidadMorbida() {
        Person person = new Person(130, 1.75);
        CalculatorImc calculator = new CalculatorImc(person);
        assertEquals("Esta persona tiene obesidad mórbida.", calculator.getImcCategory());
    }
}

