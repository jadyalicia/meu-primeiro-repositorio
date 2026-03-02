import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args) {

        System.out.println("Contador");
        System.out.println("Digite seu nome e um número positivo.");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite um número positivo:");
        int numero = sc.nextInt();

        System.out.println("Contagem Crescente");
        for (int i = 0; i <= numero; i++) {
            System.out.println("Crescente: " + i);
        }

        System.out.println("Contagem Decrescente");
        for (int i = numero; i >= 0; i--) {
            System.out.println("Decrescente: " + i);
        }

        System.out.println("Resultado do Nome");
        if (nome.length() > 6) {
            for (int i = 0; i < numero; i++) {
                System.out.println(nome);
            }
        } else {
            System.out.println(nome);
        }

        sc.close();
    }
}

