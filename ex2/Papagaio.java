package ex2;

public class Papagaio implements Falante, Voavel {
    @Override
    public void falar() {
        System.out.println("Papagaio diz: 'Olá!'");
    }

    @Override
    public void voar() {
        System.out.println("Papagaio está voando!");
    }
}