import java.util.Scanner;

public class Exercicio110310 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kilogramas;
        double litrosAgua;

        System.out.println("Digite seu peso (em quilogramas): ");
        kilogramas = input.nextDouble();

        litrosAgua = (kilogramas * 35 / 1000);

        System.out.println("Você deve beber: " + litrosAgua + " litros de água");

        input.close();
    }
}
 
 
 
 
    
