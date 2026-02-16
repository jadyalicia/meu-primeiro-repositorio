import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo!");

        System.out.println("Digite o seu nome completo:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF:");
        String CPF = scanner.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Qual é seu peso?:");
        double peso = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Qual é a sua altura?");
        String altura = scanner.nextLine();

        System.out.println("Digite seu estado civil:");
        String estadocivil = scanner.nextLine();

        scanner.close();

        System.out.println("O seu nome é " + nome +
                ", seu CPF é " + CPF +
                ", sua idade é " + idade +
                ", seu peso é " + peso +
                ", sua altura é " + altura +
                " e seu estado civil é " + estadocivil);
    }
}

