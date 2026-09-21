import java.util.Scanner;

public class Boletos {
    public static void main(String[] args) {
        Scanner contas = new Scanner(System.in);

        System.out.println("Digite os 4 boletos a serem pagos:");

        System.out.print("Digite o valor do primeiro boleto: R$ ");
        double valorAgua = contas.nextDouble();

        System.out.print("Digite o valor do segundo boleto: R$ ");
        double valorLuz = contas.nextDouble();

        System.out.print("Digite o valor do terceiro boleto: R$ ");
        double valorNet = contas.nextDouble();

        System.out.print("Digite o valor do quarto boleto: R$ ");
        double valorCarro = contas.nextDouble();

        double valorTotal = valorAgua + valorLuz + valorNet + valorCarro;
        System.out.printf("O valor total dos seus boletos é: R$ %.2f%n", valorTotal);

        contas.close();
    }
}
