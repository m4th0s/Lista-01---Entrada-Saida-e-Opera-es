import java.util.Scanner;

public class Trocomaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do primeiro produto: R$ ");
        double produto1 = leitor.nextDouble();

        System.out.print("Digite o valor do segundo produto: R$ ");
        double produto2 = leitor.nextDouble();

        System.out.print("Digite o valor do terceiro produto: R$ ");
        double produto3 = leitor.nextDouble();

        double valorTotal = produto1 + produto2 + produto3;

        System.out.print("Informe o valor dado por Maria: R$ ");
        double valorDado = leitor.nextDouble();

        double troco = valorDado - valorTotal;

        System.out.printf("O total dos produtos foi de: R$ %.2f%n", valorTotal);
        if (troco >= 0) {
            System.out.printf("O troco de Maria é de: R$ %.2f%n", troco);
        } else {
            System.out.printf("Faltou para pagar: R$ %.2f%n", Math.abs(troco));
        }

        leitor.close();
    }
}
