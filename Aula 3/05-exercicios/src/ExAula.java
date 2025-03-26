import java.util.Scanner;

public class ExAula {
    public static void main(String[] args) {
        //escrever main

        Scanner sc = new Scanner(System.in);
        double x, y, raiz, potencia;

        System.out.println("x --> ");
        x = sc.nextDouble();

        System.out.println("y --> ");
        y = sc.nextDouble();

        potencia = Math.pow(x, y);
        raiz = Math.sqrt(x + y);

        System.out.println("X ^ Y = "+potencia);
        System.out.println("raiz = "+raiz);
    }
}
