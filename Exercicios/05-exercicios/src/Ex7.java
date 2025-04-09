import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double x,y,auxiliar;

        System.out.println("Digite x --> ");
        x = sc.nextDouble();

        auxiliar = (Math.pow(x,4) - 1) / (2 * Math.pow(x,2));
        y = Math.sqrt( 1 + Math.pow(auxiliar,2)) - Math.pow(x,2) / 2;

        System.out.println("y --> "+df.format(y));
    }
}
