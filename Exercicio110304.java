import java.util.Scanner;

public class Exercicio110304 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor (A): ");
        double a = input.nextDouble();

        System.out.println("Digite o segundo valor (B): ");
        double b = input.nextDouble();

        System.out.println("Digite o terceiro valor (C): ");
        double c = input.nextDouble();

        // Calcula o valor desconhecido (X) usando a regra de três
        double x = (b * c) / a;

        System.out.println("O valor final (X) é: " + x);
    }
}