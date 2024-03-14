import java.util.Scanner;

public class Exercicio110307 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a largura da área a ser revestida (em metros): ");
        double largura = input.nextDouble();

        System.out.println("Digite o comprimento da área a ser revestida (em metros): ");
        double comprimento = input.nextDouble();

        System.out.println("Digite a largura da cerâmica escolhida (em centímetros): ");
        double larguraCeramica = input.nextDouble();

        System.out.println("Digite o valor do metro quadrado da cerâmica escolhida: ");
        double valorMetroQuadrado = input.nextDouble();

        // Calcula a área total da área a ser revestida
        double areaTotal = largura * comprimento;

        // Calcula a área de uma unidade de cerâmica (convertendo largura para metros)
        double areaCeramica = (larguraCeramica / 100) * 1; // 1 metro de comprimento

        // Calcula a quantidade de cerâmica necessária (considerando 10% de margem)
        double quantidadeCeramica = Math.ceil(areaTotal / areaCeramica * 1.1);

        // Calcula o valor total a ser pago
        double valorTotal = quantidadeCeramica * valorMetroQuadrado * areaCeramica;

        System.out.println("\nQuantidade de cerâmica necessária: " + (int) quantidadeCeramica + " unidades");
        System.out.println("Valor total a ser pago: R$" + valorTotal);
    }
}