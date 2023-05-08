package Exercicio7;

public abstract class Mamifero extends Animal {
    private String raca;
    private int registro;
    private String dono;

    public Mamifero(){

    }

    public Mamifero(String nome, String raca, int registro, String dono) {
        super(nome);
        this.raca = raca;
        this.registro = registro;
        this.dono = dono;
    }

    public abstract void falar();

    public void imprimir(){
        System.out.println("Meu nome é " + getNome());
        System.out.println("Sou da raça " + getRaca());
        System.out.println("Meu número de registro é" + getRegistro());
        System.out.println("Meu dono é o(a) " + getDono());
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
