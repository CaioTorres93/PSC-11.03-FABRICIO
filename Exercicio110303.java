import java.util.Scanner;

public class Exercicio110303 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        double num1;
        double num2;
        double num3;
        double raiz;

        System.out.println("Digite o valor de a: ");
        num1 = input.nextDouble();
        System.out.println("Digite o valor de b: ");
        num2 = input.nextDouble();
 
        // Calcula a hipotenusa usando o teorema de Pitágoras
        num3 = (num1 * num1 ) + (num2 * num2);
        raiz = Math.sqrt(num3);

        System.out.println("A hipotenusa é: " + raiz);

        input.close();
    }

}