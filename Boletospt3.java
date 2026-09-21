import java.util.Scanner;

public class Boletospt3 {
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

        System.out.print("Digite o valor do seu salário bruto: R$ ");
        double salarioBruto = contas.nextDouble();

        double desconto = salarioBruto * 0.14;
        double salarioLiquido = salarioBruto - desconto;
        double valorTotal = valorAgua + valorLuz + valorNet + valorCarro;
        double resto = salarioLiquido - valorTotal;

        System.out.printf("Seu salário líquido é de: R$ %.2f%n", salarioLiquido);
        System.out.printf("O valor total dos seus boletos é: R$ %.2f%n", valorTotal);
        System.out.printf("Sobrou do seu salário após pagamentos e descontos: R$ %.2f%n", resto);

        contas.close();
    }
}
