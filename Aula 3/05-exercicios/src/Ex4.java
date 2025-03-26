import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        double salario, qntQuilowatts, valorQuillowats, valorReais, novoValor;

        System.out.print("Digite o valor do salário mínimo:");
        salario = sc.nextDouble();

        System.out.print("Digite o valor do quilowatts gasto na residência:");
        qntQuilowatts = sc.nextDouble();

        valorQuillowats = (salario/7)/100;

        System.out.println("O valor em reais de cada quilowatts é de: "+ df.format(valorQuillowats));

        valorReais = valorQuillowats * qntQuilowatts;

        System.out.println("O valor em reais a ser pago pela residência é de: "+df.format(valorReais));

        novoValor = valorReais * 90/100;
        //ou dividir por 0.9

        System.out.println("O valor a ser pago pela residência com o desconto de 10% é de: "+df.format(novoValor));

    }
}
