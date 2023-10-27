import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");
        float C = Ler.nextFloat();
        float F = (9 * C + 160) / 5;
        System.out.printf("A conversão de %.2f°C para Fahrenheit é %.2f", C, F);
        Ler.close();
    }
}