package ex1;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase; // Sem bônus
    }
}