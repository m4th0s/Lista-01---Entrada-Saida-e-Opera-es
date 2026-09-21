import java.util.Scanner;

public class ViagemLucas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor em BRL que deseja converter para EUR: R$ ");
        double reais = leitor.nextDouble();

        System.out.print("Digite o valor atual de 1 EUR em reais: R$ ");
        double euro = leitor.nextDouble();

        double conversaoTotal = reais / euro;

        System.out.printf("Com R$ %.2f você terá o equivalente a %.2f EUR.%n",
                reais, conversaoTotal);

        leitor.close();
    }
}
