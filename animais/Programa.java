package Exercicio7;

public class Programa {
    public static void main(String[] args) {


        Animal[] animais = new Animal[10];


        BemTeVi bemTeVi1 = new BemTeVi("Benzinho");
        Papagaio papagaio1 = new Papagaio("Jósé");
        Cachorro cachorro1 = new Cachorro("Bidu", "SRD", 98765, "Paulo");
        Vaca vaca1 = new Vaca("Mimosa", "Holandesa", 12345, "João");



//        cachorro1.falar();
//        cachorro1.imprimir();
//        vaca1.falar();
//        vaca1.imprimir();
//        bemTeVi1.falar();
//        bemTeVi1.imprimir();
//        papagaio1.falar();
//        papagaio1.imprimir();

        animais[0] = bemTeVi1;
        animais[2] = papagaio1;
        animais[3] = cachorro1;
        animais[4] = vaca1;

        for (int i = 0; animais[i] != null; i++) {
            System.out.println(animais[i].getNome());

        }
      }
}

