import java.util.Scanner;

public class Exercicio110305 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo: ");
        double largura = input.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = input.nextDouble();

        
        double area = largura * altura;
        double perimetro = 2 * (largura + altura);
        double diagonal = Math.sqrt(largura * largura + altura * altura);

        
        System.out.println("\nResultados:");
        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);
    }
}