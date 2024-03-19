import java.util.Scanner;

public class Exercicio110312 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a potência do equipamento (em Watts): ");
        double potenciaWatts = input.nextDouble();

        System.out.println("Digite a quantidade de horas que o equipamento fica ligado por dia: ");
        double horasPorDia = input.nextDouble();

        System.out.println("Digite o valor do KW/h (em reais): ");
        double valorKWh = input.nextDouble();

        // Calcula o consumo diário em KWh
        double consumoDiarioKWh = (potenciaWatts * horasPorDia) / 1000;

        // Calcula o valor pago pelo consumo diário
        double valorPagoDiario = consumoDiarioKWh * valorKWh;

        // Estima o número médio de dias em um mês (30 dias)
        int diasPorMes = 30;

        // Calcula o custo mensal
        double custoMensal = valorPagoDiario * diasPorMes;

        System.out.println("\nConsumo diário: " + consumoDiarioKWh + " KWh");
        System.out.println("Valor pago diariamente: R$" + valorPagoDiario);
        System.out.println("Custo mensal estimado: R$" + custoMensal);
    }
}