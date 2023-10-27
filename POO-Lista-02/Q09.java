import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor de três dígitos: ");
        int num = scanner.nextInt();

        if (num >= 100 && num <= 999) {
            int d1 = num / 100;
            int d2 = (num % 100) / 10;
            int d3 = num % 10;

            int inverso = d3 * 100 + d2 * 10 + d1;

            System.out.println("O valor original é: " + num);
            System.out.println("O valor invertido é: " + inverso);
        } else {
            System.out.println("O número informado não tem três dígitos.");
        }

        scanner.close();
    }
}
