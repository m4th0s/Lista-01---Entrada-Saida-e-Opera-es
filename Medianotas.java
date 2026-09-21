import java.util.Scanner;

public class Medianotas {
    public static void main(String[] args) {
        Scanner boletim = new Scanner(System.in);

        System.out.println("DIGITE ABAIXO AS 3 NOTAS");

        System.out.print("Digite a primeira nota: ");
        double nota1 = boletim.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = boletim.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = boletim.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3.0;
        System.out.printf("A média das notas é: %.2f%n", media);

        boletim.close();
    }
}
