import java.util.Scanner;

public class Exercicio110308 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo (em MB): ");
        double tamanhoArquivoMB = input.nextDouble();

        System.out.println("Digite a velocidade do link (em Mbps): ");
        double velocidadeMbps = input.nextDouble();

        // Calcula o tempo total de download (em segundos)
        double tempoSegundos = (tamanhoArquivoMB * 8) / velocidadeMbps;

        // Converte para minutos
        double tempoMinutos = tempoSegundos / 60;

        System.out.println("\nTempo total de download: " + tempoMinutos + " minutos");
    }
}