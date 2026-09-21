import java.util.Scanner;

public class DescontoFernanda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o preço original do produto: R$ ");
        double precoOriginal = leitor.nextDouble();

        double desconto = precoOriginal * 0.15;
        double precoFinal = precoOriginal - desconto;

        System.out.printf("Desconto de 15%%: R$ %.2f%n", desconto);
        System.out.printf("Preço final do produto: R$ %.2f%n", precoFinal);

        leitor.close();
    }
}
