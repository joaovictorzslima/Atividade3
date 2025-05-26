package ex3;

public class Ivysaur extends Pokemon implements Evoluivel {
    public Ivysaur() {
        super("Ivysaur");
    }

    @Override
    public void atacar() {
        System.out.println(nome + " usa Folha Navalha!");
    }

    @Override
    public void evoluir() {
        System.out.println(nome + " está evoluindo para Venusaur!");
    }
}