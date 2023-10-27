import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua idade em anos, meses e dias:\n\n");

        System.out.print("Informe sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Já se passou quantos meses desde seu aniversário?: ");
        int meses = scanner.nextInt();

        System.out.print("E quantos dias?: ");
        int dias = scanner.nextInt();

        int idade = (anos * 365) + (meses * 30) + dias;

        System.out.println("Anos: " + anos);
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);
        System.out.println("Sua idade expressa em dias é: " + idade);
    }
}