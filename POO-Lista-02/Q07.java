import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor do saque: ");
        int saque = scanner.nextInt();

        int notas100 = saque / 100;
        int notas50 = (saque % 100) / 50;
        int notas10 = ((saque % 100) % 50) / 10;
        int notas5 = (((saque % 100) % 50) % 10) / 5;
        int notas1 = (((saque % 100) % 50) % 10) % 5;

        System.out.println("O valor do saque pode ser expresso em:");
        
        System.out.println(notas100 + " notas de 100");
        System.out.println(notas50 + " notas de 50");
        System.out.println(notas10 + " notas de 10");
        System.out.println(notas5 + " notas de 5");
        System.out.println(notas1 + " notas de 1");

    }
}