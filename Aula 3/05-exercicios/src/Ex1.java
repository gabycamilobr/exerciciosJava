import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double área;
        double perímetro;
        double base;
        double altura;

        System.out.print("Digite a base do rentângulo: ");
        base = sc.nextDouble();
        System.out.print("Digite a altura do rentângulo: ");
        altura = sc.nextDouble();

        área = base*altura;
        perímetro = 2*base+2*altura;

        System.out.println("A área do retângulo é " +área+ "m.");
        System.out.println("O perímetro do retângulo é " +perímetro+"m.");

    }
}
