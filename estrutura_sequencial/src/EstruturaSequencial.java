import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

    /*

    ~Expressões Aritméticas~
        cálculo da esquerda para a direita. 1lugar [* / %] 2lugar [+ -]. (em parênteses é feito primeiro). % resto da divisão 6/3=2 resto 0 6%3=0 7%3=1

    ~Variáveis e tipos básicos em Java~
        tipos númericos inteiros [byte, short, int, long]. tipos com ponto flutuante [float, double]. caractere Unicode [char]. valor verdade [boolean]. String [cadeia de caracteres (palavra ou texto)
        nome de variavel: começar com letra ou _

    ~As três operações básicas de programação~
        1. Entrada de dados (leitura) 2. Processamento de dados 3. Saída de dados (escrita)

    ~Saída de dados em Java~
        System.out.print("Olá mundo"); < sem quebra de linha.
        System.out.println("Olá mundo"); < com quebra de linha.
        double x = 10.35784;  < queremos controlar as casas decimais. no lugar de `println` usamos `printf`
        System.out.printf("%.2f%n", x);  < o `%.2f` significa que quer formatar com duas casas decimais. o `%n` é quebra de linha

        - Concatenar vários elementos em um mesmo comando de escrita:
            %f = ponto flutuante, %d = inteiro, %s = texto, %n = quebra de linha
            String nome = "Maria";
            int idade = 31;
            double renda = 4000.0;
            System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

    ~Processamento de dados em Java, Casting~
        Casting:
            int a, b;
            double resultado;
            a = 5;
            b = 2;
            resultado = (double) a / b; <<< caso não tivesse o '(double)', o resultado sairia 3, ele reconheceria como numero inteiro.

    ~Entrada de dados em Java - Parte 1~
        Scanner sc = new Scanner(System.in);

        String y;
        int z;
        double w;
        char a;
        System.out.println("Linha contínua:");
        y = sc.next();
        sc.nextLine(); // <<<< necessário para absorver a quebra de linha. sempre depois de qualquer entrada que não seja nextLine é necessário, caso contrário se tiver um nextLine ele consome uma entrada em branco.
        System.out.println(y);
        System.out.println("Linha com espaços:");
        y = sc.nextLine();
        System.out.println(y);
        System.out.println("Número inteiro:");
        z = sc.nextInt();
        System.out.println(z);
        System.out.println("Número flutuante:");
        w = sc.nextDouble();
        System.out.println(w);
        System.out.println("Lê o primeiro caractere:");
        a = sc.next().charAt(0);
        System.out.println(a);

        sc.close();

    ~Entrada de dados em Java - Parte 2~
        System.out.println("Linha contínua:");
        y = sc.next();
        sc.nextLine(); // <<<< necessário para absorver a quebra de linha. sempre depois de qualquer entrada que não seja nextLine é necessário, caso contrário se tiver um nextLine ele consome uma entrada em branco.
        System.out.println(y);
        System.out.println("Linha com espaços:");
        y = sc.nextLine();

    ~Funções matemáticas em Java~
        Variável A recebe a raiz quadrada de x A = Math.sqrt(x); Variável A recebe o resultado de x elevado a y A = Math.pow(x, y); Variável A recebe o valor absoluto de x

    */

    public static void main(String[] args) {

        /* Locale.setDefault(Locale.US); usado para definir a localidade, define separação com . ou , dos numeros double */
        System.out.println("Saída de dados em Java");
        double x = 10.35784; /* queremos controlar as casas decimais. no lugar de `println` usamos `printf` */
        System.out.printf("%.2f metros%n", x); /* o `%.2f` significa que quer formatar com duas casas decimais. o `%n` é quebra de linha*/

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        /* Exercício de fixação */
        String product1 = "Computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);

        System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender);

        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);

        /* Entrada de dados em Java - Parte 1 */
        Scanner sc = new Scanner(System.in);

        String y;
        int z;
        double w;
        char a;
        System.out.println("Linha contínua:");
        y = sc.next();
        sc.nextLine(); // <<<< necessário para absorver a quebra de linha. sempre depois de qualquer entrada que não seja nextLine é necessário, caso contrário se tiver um nextLine ele consome uma entrada em branco.
        System.out.println(y);
        System.out.println("Linha com espaços:");
        y = sc.nextLine();
        System.out.println(y);
        System.out.println("Número inteiro:");
        z = sc.nextInt();
        System.out.println(z);
        System.out.println("Número flutuante:");
        w = sc.nextDouble();
        System.out.println(w);
        System.out.println("Lê o primeiro caractere:");
        a = sc.next().charAt(0);
        System.out.println(a);


        /* Exercícios de fixação */
        Scanner scan = new Scanner(System.in);

        int n1, n2;
        System.out.println("Primeiro número inteiro:");
        n1 = scan.nextInt();
        System.out.println("Segundo número inteiro:");
        n2 = scan.nextInt();
        int soma = n1 + n2;
        System.out.printf("SOMA = %d%n", soma);

        double raio;
        System.out.println("Digite o raio do círculo:");
        raio = scan.nextDouble();
        double area = Math.PI * (raio * raio);
        System.out.printf("A = %.4f", area);

        sc.close();
        scan.close();
    }

}
