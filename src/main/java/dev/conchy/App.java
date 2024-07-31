package dev.conchy;

import dev.conchy.models.CalculatorImc;
import dev.conchy.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }


    public static void main(String[] args) {
        Person person = new Person(51, 1.57);
        CalculatorImc calculatorImc = new CalculatorImc(person);
        System.out.println("La persona pesa " + person.getWeight() + " kilogramos y mide " + person.getHeight() + " metros");
        System.out.println("IMC: " + calculatorImc.getImc());
        System.out.println(calculatorImc.getImcCategory());
    }
}
