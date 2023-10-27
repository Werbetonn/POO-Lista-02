import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        float Autonomia = 12;
        System.out.println("Informe o tempo gasto durante a viagem: \nOBS: Informe o valor em Horas");
        float Tempo = Ler.nextFloat();
        System.out.println("Informe a velocidade média do veículo durante o percurso: \nOBS: Informe o valor em Km/h");
        float Velocidade = Ler.nextFloat();
        float Distancia = Tempo * Velocidade;
        float Litros = Distancia / Autonomia;
        System.out.println("\nInformações da Viagem: ");
        System.out.printf("Velocidade Média: %.2f Km/h\n", Velocidade);
        System.out.printf("Tempo Gasto: %.2f Horas \n", Tempo);
        System.out.printf("Distância Percorrida: %.2f Km\n", Distancia);
        Ler.close();
        System.out.printf("Litros Gastos: %.2f L", Litros);
    }
}