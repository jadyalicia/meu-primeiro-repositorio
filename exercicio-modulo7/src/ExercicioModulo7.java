import java.util.Scanner;

public class ExercicioModulo7 {

        static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Olá, digite dois numeros inteiros!");

            System.out.println("Digite o primeiro numero:");
            int n1 = scanner.nextInt();

            System.out.println("Digite o segundo numero:");
            int n2 = scanner.nextInt();
            
            if (n1 > n2) {
                System.out.println("O maior numero é: " + n1);
            } else if (n2 > n1) {
                System.out.println("O maior numero é: " + n2);
            } else {
                System.out.println("Os dois numeros sao iguais");
            }

            scanner.close();
        }
    }

