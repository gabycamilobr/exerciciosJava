import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        // declaração da variável Scanner
        Scanner sc = new Scanner(System.in);

        // criação das variáveis --> declaração de variáveis
        double nota1, nota2, nota3, media;

        // atribuir as notas para as variáveis
        /*nota1 = 10;
        nota2 = 5.5;
        nota3 = 9;*/

        // entrada de dados
        System.out.print("digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("digite a terceira nota: ");
        nota3 = sc.nextDouble();

        // cálculo da média
        media = (nota1 + nota2 + nota3) / 3;

        // saída de dados no termino
        System.out.println("média final = " +media+"");
    }
}
