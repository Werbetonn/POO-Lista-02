import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        System.out.println("Informe o valor para fazer a tabuada: ");
        int num = Ler.nextInt();
        for (int rep = 1; rep <= 10; rep++) {
            System.out.printf("%d * %d = %d\n", num, rep, num * rep);
        }
    }
}