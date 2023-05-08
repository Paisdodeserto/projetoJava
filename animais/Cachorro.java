package Exercicio7;

public class Cachorro extends Mamifero{


    public Cachorro(String nome, String raca, int registro, String dono) {
        super(nome, raca, registro, dono);
    }

    public void falar() {
        System.out.println("Sou um cachorro e falo auau.");
    }
}
