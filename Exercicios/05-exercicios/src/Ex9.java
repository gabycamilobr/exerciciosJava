import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTotal, numInvertido, unidade, dezena, centena;

        System.out.println("Digite 3 dígitos (100 - 999): ");
        numTotal = sc.nextInt();

        dezena = numTotal % 100 / 10;
        unidade = numTotal % 10;
        centena = numTotal / 100;

        numInvertido = unidade * 100 + dezena * 10 + centena;

        System.out.println("Seu número de traz pra frente é: "+numInvertido);

    }
}
