import java.util.Scanner;

public class renan {
    public static void main(String[] args) {

        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.5;

        double maiorNota = Math.max(nota1, Math.max(nota2, nota3));
        double menorNota = Math.min(nota1, Math.min(nota2, nota3));

        double soma = nota1 + nota2 + nota3;
        double media = (soma - menorNota) / 2;

        System.out.println("A média das duas maiores notas é: " + media);
    }
}

