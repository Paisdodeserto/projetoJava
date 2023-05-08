package Exercicio10;

public class Programador extends Funcionario{

        public void aumentaSalario(){
            setSalario(getSalario()*1.2f);
    }

    public void imprimir(){
        System.out.println("\nNome do programador: " + getNome());
        System.out.println("\nSalário do programador: R$ " + getSalario());
        System.out.println("\nAumento salarial de 20%: R$ " + (getSalario()*20)/100);
        System.out.println("\nSalário reajustado: R$ " + (getSalario()+(getSalario()*20)/100));
        System.out.println("\n-------------------------------------------------------------------");

    }
}
