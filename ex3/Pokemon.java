package ex3;

public abstract class Pokemon {
    protected String nome;

    public Pokemon(String nome) {
        this.nome = nome;
    }

    public abstract void atacar();

    public void mostrarNome() {
        System.out.println("Pokemon: " + nome);
    }
}
