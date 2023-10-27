import java.util.Scanner;
public class Q06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a duração do evento em segundos: ");
        int duracaoseg = scanner.nextInt();

        int horas = duracaoseg / 3600;
        int minutos = (duracaoseg % 3600) / 60;
        int segundos = duracaoseg % 60;

        String Horas = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        System.out.println("Duração do evento: " + Horas);

        scanner.close();
    }
}