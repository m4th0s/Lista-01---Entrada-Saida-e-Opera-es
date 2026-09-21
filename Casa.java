import java.util.Scanner;

public class Casa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaTotal = 0;

        // O exercício calcula a área de 3 cômodos.
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a largura do cômodo " + i + " em metros: ");
            double largura = sc.nextDouble();

            System.out.print("Digite o comprimento do cômodo " + i + " em metros: ");
            double comprimento = sc.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.printf("A área do cômodo %d é: %.2f m²%n", i, areaComodo);
        }

        System.out.printf("A área total da casa é: %.2f m²%n", areaTotal);
        sc.close();
    }
}
