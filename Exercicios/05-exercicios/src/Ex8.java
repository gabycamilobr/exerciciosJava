import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, dezena;

        System.out.println("Digite 3 dígitos (100 - 999): ");
        num = sc.nextInt();

        dezena = num % 100 / 10;

        System.out.println("A dezena é: "+dezena);

    }
}
