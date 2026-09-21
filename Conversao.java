import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a altura em metros: ");
        double metros = leitor.nextDouble();

        double centimetros = metros * 100;
        int pes = (int) (centimetros / 30.48);
        double polegadas = centimetros / 2.54;

        System.out.printf("A altura corresponde a %.2f cm.%n", centimetros);
        System.out.println("A altura corresponde a " + pes + " pés.");
        System.out.printf("A altura corresponde a %.3f polegadas.%n", polegadas);

        leitor.close();
    }
}
