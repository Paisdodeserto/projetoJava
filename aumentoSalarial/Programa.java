package Exercicio10;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        ArrayList <Funcionario> funcionarios = new ArrayList<>();

//        Funcionario funcionario1 = new Gerente();
//        Funcionario funcionario2 = new Programador();


//            Scanner sc = new Scanner(System.in);
//            System.out.println("Digite o nome do Funcionário: ");
//            funcionario1.setNome(sc.next());
//            System.out.println("Digite o salário do Funcionário: ");
//            funcionario1.setSalario(sc.nextInt());

        Funcionario funcionario1 = new Gerente();

        funcionario1.setSalario(6000);
        funcionario1.setNome("Mario Quintana");

        Funcionario funcionario2 = new Programador();

        funcionario2.setSalario(5000);
        funcionario2.setNome("Ana Arruda");

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        int numero;
        Scanner sc1 = new Scanner(System.in);
        do {
            System.out.println(("'1' - para imprimir os dados"));
            System.out.println(("'2' - para aumentar salario do gerente"));
            System.out.println(("'3' - para aumentar salario do programador"));
            System.out.println(("'0' - para sair"));
            numero = sc1.nextInt();


        switch (numero){
            case 1:
                for (int i = 0; i < funcionarios.size(); i++){
                    System.out.println("Nome do funcionário: " + funcionarios.get(i).getNome());
                    System.out.println("Salário do funcionário: R$ "+ funcionarios.get(i).getSalario());
                    System.out.println("\n-------------------------------------------------------------------");
                }
                break;
            case 2:
                for (int i = 0; i < funcionarios.size(); i++){
                    if (funcionarios.get(i).getClass().equals(Gerente.class)) { //equals - compara o objeto na posição index se é da mesma classe
                        funcionarios.get(i).aumentaSalario();
                        funcionarios.get(i).imprimir();
                    }
                }
                break;
            case 3:
                for (int i = 0; i < funcionarios.size(); i++){
                    if (funcionarios.get(i).getClass().equals(Programador.class)) {
                        funcionarios.get(i).aumentaSalario();
                        funcionarios.get(i).imprimir();
                    }
                }
            case 4:
                if (numero >= 4){
                    System.out.println("Solicitação inválida. Digte novamente.");
                }
                break;
        }
        }while (numero != 0);

        for (int i = 0; i <funcionarios.size(); i++) {


        System.out.println(funcionarios.get(i).getClass());
        }
    }
}
