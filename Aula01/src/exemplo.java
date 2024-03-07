import java.util.Scanner;
public class Exemplos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a média dos CheckPoints: ");
        float cp = scanner.nextFloat();

        System.out.println("Digite a média da Global Solution: ");
        float gs = scanner.nextFloat();

        System.out.println("Digite a média do Challenge: ");
        float challenge = scanner.nextFloat();
        float media = cp * .2f + gs * .6f + challenge * .2f;

        System.out.println("Sua média foi: " + media);

    }

}
