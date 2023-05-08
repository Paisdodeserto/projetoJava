package Exercicio7;

public abstract class Animal {

    private String nome;


    public Animal(){

    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return (nome);
    }

    public abstract void falar();
}

