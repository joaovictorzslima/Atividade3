package ex3;

public class Bulbasaur extends Pokemon implements Evoluivel {
    public Bulbasaur() {
        super("Bulbasaur");
    }

    @Override
    public void atacar() {
        System.out.println(nome + " usa Chicote de Vinha!");
    }

    @Override
    public void evoluir() {
        System.out.println(nome + " está evoluindo para Ivysaur!");
    }
}