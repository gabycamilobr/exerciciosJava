import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("0,000.00");
        Scanner sc = new Scanner(System.in);

        double salarioLiquido, salarioBruto, valorHoraAula, descINSS, valorDesconto;
        int numHoraMes;

        System.out.print("Digite o valor da sua hora aula: ");
        valorHoraAula = sc.nextDouble();

        System.out.print("Digite o seu número de horas trabalhadas por mês: ");
        numHoraMes = sc.nextInt();

        System.out.print("Digite o valor do seu desconto do INSS em %: ");
        descINSS = sc.nextDouble();

        salarioBruto = valorHoraAula * numHoraMes;
        valorDesconto = descINSS * salarioBruto / 100;
        salarioLiquido = salarioBruto-valorDesconto;

        System.out.println("Salário bruto R$ " + df.format(salarioBruto)+".");
        System.out.println("Desconto R$ " + df.format(valorDesconto)+".");
        System.out.println("Salário líquido R$ " + df.format(salarioLiquido)+".");
    }
}
