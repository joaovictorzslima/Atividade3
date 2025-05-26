package ex1;

public class Gerente extends Funcionario implements Bonificavel {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.1; // Exemplo: 10% de bônus
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }
}