package ex2;

public class Main2 {
    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio();
        Drone drone = new Drone();
        Pessoa pessoa = new Pessoa();

        System.out.println("Interagindo com o papagaio:");
        papagaio.falar();
        papagaio.voar();

        System.out.println("\nInteragindo com o drone:");
        drone.voar();

        System.out.println("\nInteragindo com a pessoa:");
        pessoa.falar();
    }
}