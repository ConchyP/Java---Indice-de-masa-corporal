package dev.conchy.models;

public class CalculatorImc {

    private Person person;
    private double imc;

    public CalculatorImc(Person person) {
        this.person = person;
        this.calculate();
    }

    public double getImc() {
        return imc;
    }

    private void calculate() {
        this.imc = person.getWeight() / Math.pow(person.getHeight(), 2);
    }

    public String getImcCategory() {
        if (imc < 16) {
            return "Esta persona tiene delgadez severa.";
        } else if (imc < 17) {
            return "Esta persona tiene delgadez moderada.";
        } else if (imc < 18.5) {
            return "Esta persona tiene delgadez leve.";
        } else if (imc < 25) {
            return "Esta persona tiene un peso normal.";
        } else if (imc < 30) {
            return "Esta persona tiene sobrepeso.";
        } else if (imc < 35) {
            return "Esta persona tiene obesidad leve.";
        } else if (imc < 40) {
            return "Esta persona tiene obesidad media.";
        } else {
            return "Esta persona tiene obesidad mórbida.";
        }
    }

}
