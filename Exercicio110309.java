import java.util.Scanner;

public class Exercicio110309 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso atual (em quilogramas): ");
        double pesoKg = input.nextDouble();

        System.out.println("Digite a altura (em centímetros): ");
        double alturaCm = input.nextDouble();

        // Convertendo altura para metros
        double alturaMetros = alturaCm / 100.0;

        // Calculando o IMC
        double imc = pesoKg / (alturaMetros * alturaMetros);

        // Exibindo o resultado
        System.out.println("\nResultado do IMC:");
        System.out.println("IMC: " + imc);

        // Peso ideal (considerando IMC entre 18.5 e 24.9)
        double pesoIdealMin = 18.5 * alturaMetros * alturaMetros;
        double pesoIdealMax = 24.9 * alturaMetros * alturaMetros;

        System.out.println("Peso ideal: Entre " + pesoIdealMin + " kg e " + pesoIdealMax + " kg");
    }
}