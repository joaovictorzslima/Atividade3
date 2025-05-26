package ex1;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalarioFinal();

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
    }
}