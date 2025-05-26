package ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Carlos", 5000));
        funcionarios.add(new Estagiario("Ana", 1500));
        funcionarios.add(new Gerente("Mariana", 7000));
        funcionarios.add(new Estagiario("João", 1300));

        for (Funcionario f : funcionarios) {
            f.mostrarDados();

            if (f instanceof Bonificavel) {
                Bonificavel b = (Bonificavel) f;
                System.out.println("Bônus: R$ " + b.calcularBonus());
            } else {
                System.out.println("Este funcionário não recebe bônus.");
            }
            System.out.println("-----------------------------");
        }
    }
}