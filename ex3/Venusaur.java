package ex3;

public class Venusaur extends Pokemon {
    public Venusaur() {
        super("Venusaur");
    }

    @Override
    public void atacar() {
        System.out.println(nome + " usa Raio Solar!");
    }
}
