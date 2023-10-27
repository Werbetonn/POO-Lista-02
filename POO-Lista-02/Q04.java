import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar separando as casas dos cenavos por ',': ");
        double cotacao = Scanner.nextDouble();

        System.out.print("Digite o valor em dólares separando as casas dos cenavos por ',': ");
        double dolares = Scanner.nextDouble();

        double reais = dolares * cotacao;

        System.out.printf("O valor em reais é R$ %.2f", reais);
    }
}