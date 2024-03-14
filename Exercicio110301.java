import java.util.Scanner;

public class Exercicio110301 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas;
        int minutos;
        int horasDia;
        int minutosDia;

        System.out.println("Me fala hora atual: ");
        horas = input.nextInt();

        System.out.println("Me fale o minuto atual: ");
        minutos = input.nextInt();

        horasDia = (horas * 60);
        minutosDia = (minutos + horasDia);

        System.out.println("Se passaram: " + minutosDia + "minutos");


    
    
    
    
    
    
    
    
    
    }



}