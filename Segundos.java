import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {
        Scanner total = new Scanner(System.in);

        double segundosPorMinuto = 60;
        double minutosPorHora = 60;
        double horasPorDia = 24;
        double diasPorAno = 365;

        System.out.print("Informe a quantidade de anos: ");
        double anos = total.nextDouble();

        double segundosTotais = anos * diasPorAno * horasPorDia
                * minutosPorHora * segundosPorMinuto;

        System.out.printf("Em %.2f anos existem %.0f segundos.%n", anos, segundosTotais);

        total.close();
    }
}
