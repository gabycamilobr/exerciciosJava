import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        int salarioLiquido, salarioBruto, valorHoraAula, numHoraMes, descINSS, valorDesconto;

        System.out.print("Digite o valor da sua hora aula: ");
        valorHoraAula = sc.nextInt();

        System.out.print("Digite o seu número de horas trabalhadas por mês: ");
        numHoraMes = sc.nextInt();

        System.out.print("Digite o valor do seu desconto do INSS em %: ");
        descINSS = sc.nextInt();

        salarioBruto = valorHoraAula *numHoraMes;
        valorDesconto = (descINSS/100)*salarioBruto;
        salarioLiquido = salarioBruto-valorDesconto;

        System.out.println("O seu salário líquido é de: "+salarioLiquido+" reias.");
    }
}
