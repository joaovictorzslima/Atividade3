package ex3;

public class Main3 {
    public static void main(String[] args) {
        Bulbasaur bulbasaur = new Bulbasaur();
        Ivysaur ivysaur = new Ivysaur();
        Venusaur venusaur = new Venusaur();

        bulbasaur.mostrarNome();
        bulbasaur.atacar();
        bulbasaur.evoluir();

        System.out.println();

        ivysaur.mostrarNome();
        ivysaur.atacar();
        ivysaur.evoluir();

        System.out.println();

        venusaur.mostrarNome();
        venusaur.atacar();
    }
}
