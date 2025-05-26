package ex2;

public class Pessoa implements Falante {
    @Override
    public void falar() {
        System.out.println("Pessoa diz: 'Bom dia!'");
    }
}
