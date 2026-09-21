import java.util.Scanner;

public class Boletospt2 {
    public static void main(String[] args) {
        Scanner contas = new Scanner(System.in);

        System.out.println("== DIGITE OS 4 BOLETOS A SEREM PAGOS ==");

        System.out.print("Digite o valor do primeiro boleto: R$ ");
        double valorAgua = contas.nextDouble();

        System.out.print("Digite o valor do segundo boleto: R$ ");
        double valorLuz = contas.nextDouble();

        System.out.print("Digite o valor do terceiro boleto: R$ ");
        double valorNet = contas.nextDouble();

        System.out.print("Digite o valor do quarto boleto: R$ ");
        double valorCarro = contas.nextDouble();

        System.out.print("Digite o valor do seu salário líquido: R$ ");
        double salario = contas.nextDouble();

        double valorTotal = valorAgua + valorLuz + valorNet + valorCarro;
        double resto = salario - valorTotal;

        System.out.printf("O valor total dos seus boletos é: R$ %.2f%n", valorTotal);
        if (resto >= 0) {
            System.out.printf("Sobrou do seu salário: R$ %.2f%n", resto);
        } else {
            System.out.printf("Faltou do seu salário: R$ %.2f%n", Math.abs(resto));
        }

        contas.close();
    }
}
