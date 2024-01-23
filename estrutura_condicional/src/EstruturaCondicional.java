import java.util.InputMismatchException;
import java.util.Scanner;

public class EstruturaCondicional {

    /*

    ~Expressões Comparativas~
        > maior, < menor, >= maior ou igual, <= menor ou igual, == igual, != diferente

    ~Expressões Lógicas~
        && E, || OU, ! NÃO [x=5 !(x==10) resultado: V]

    ~Estrutura Condicional (if-else)~
        Nunca colocar condição na frente do else, somente do if...

    */

    public static void main(String[] args) {

        /* Exercício 1: Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */
        Scanner scan = new Scanner(System.in);
        String result = "";
        int num = 0;

        try {
            System.out.println("Digite um número inteiro: ");
            num = scan.nextInt();

            if (num < 0) {
                result = "negative";
            } else {
                result = "positive";
            }

            System.out.println("The number is " + num + " and is " + result);

        } catch (InputMismatchException e) {
            System.err.println("Error: the number need to be integer.");
        }

        /* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. */
        try {
            System.out.println("Digite um número inteiro: ");
            num = scan.nextInt();

            if (num % 2 == 0) {
                result = "par";
            } else {
                result = "impar";
            }

            System.out.println("The number is " + num + " and is " + result);

        } catch (InputMismatchException e) {
            System.err.println("Error: the number need to be integer.");
        }
    }

}
