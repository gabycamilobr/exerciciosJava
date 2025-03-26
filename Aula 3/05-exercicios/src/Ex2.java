import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Temperatura Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = celsius*9/5+32;

        System.out.print("Temperatura Fahrenheit: "+fahrenheit);
    }
}
