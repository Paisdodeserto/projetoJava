package Exercicio7;

public abstract class Passaro extends Animal {


    public Passaro(String nome) {
        super(nome);
    }

    public void falar() {
        System.out.println("Sou um pássaro e canto.");
    }
    public void imprimir(){
        System.out.println("Meu nome é " + getNome() + ". E sou um pássaro.");
    }

}