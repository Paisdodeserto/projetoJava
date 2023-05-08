package Exercicio7;

public class Vaca extends Mamifero {

    public Vaca(String nome, String raca, int registro, String dono) {
        super(nome, raca, registro, dono);
    }

    public void falar() {
        System.out.println("Sou uma vaca e faço muuuu....");
    }

}
