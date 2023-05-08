package Exercicio10;

public class Gerente extends Funcionario {

    private double aumentoGerente;

    public double getAumentoGerente() {
        return aumentoGerente;
    }

    public void setAumentoGerente(double aumentoGerente) {
        this.aumentoGerente = aumentoGerente;
    }

    public void aumentaSalario() {

        setSalario(getSalario()*1.1f);
    }

    public void imprimir() {
        System.out.println("\nNome do gerente: " + getNome());
        System.out.println("\nSalário do gerente: R$ " + getSalario());
        System.out.println("\nAumento salarial de 10%: R$ " + (getSalario() * 10) / 100);
        System.out.printf("\nSalário reajustado: R$ " + (getSalario()+(getSalario()*10)/100));
        System.out.println("\n-------------------------------------------------------------------");
    }

}
