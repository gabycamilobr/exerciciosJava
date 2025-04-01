import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tempoGasto, velocidadeMedia, consumo, distancia, litrosGasto;

        System.out.println("Digite o tempo gasto: ");
        tempoGasto = sc.nextDouble();

        System.out.println("Digite a velocidade média: ");
        velocidadeMedia=sc.nextDouble();

        consumo = 10.5;

        distancia = tempoGasto * velocidadeMedia;
        litrosGasto = distancia / consumo;

        System.out.println("A quantidade de litros de combustível gasto na viagem foi de: " +litrosGasto);

    }
}
