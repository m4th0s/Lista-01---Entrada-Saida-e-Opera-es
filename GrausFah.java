import java.util.Scanner;

public class GrausFah {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double graus = leitor.nextDouble();
        double fahrenheit = (graus * 1.8) + 32;

        System.out.printf("O resultado da conversão é: %.2f °F%n", fahrenheit);

        leitor.close();
    }
}
