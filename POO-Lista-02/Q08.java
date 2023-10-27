import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a diária normal: ");
        double diariaNormal = scanner.nextDouble();

        double diariaPromocao = diariaNormal * 0.78;
        double mediaArrecadadaSemPromocao = diariaNormal * 42 * 30 * 0.4;
        double mediaArrecadadaComPromocao = diariaPromocao * 42 * 30 * 0.7;
        double lucroOuPrejuizoMensal = mediaArrecadadaComPromocao - mediaArrecadadaSemPromocao;

        System.out.printf("O valor da diária no período da promoção é R$ %.2f\n", diariaPromocao);
        System.out.printf("O valor médio arrecadado sem a promoção, durante um mês é R$ %.2f\n", mediaArrecadadaSemPromocao);
        System.out.printf("O valor médio arrecadado com a promoção, durante um mês é R$ %.2f\n", mediaArrecadadaComPromocao);
        System.out.printf("O lucro ou prejuízo mensal com a promoção é R$ %.2f\n", lucroOuPrejuizoMensal);
    }
}