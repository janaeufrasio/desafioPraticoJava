import java.util.Scanner;

public class DesafioPratico {
    public static void main(String[] args) {

        //****************************************************************************************************************
        //1 - Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        /*Scanner leitura = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um número");
        numero = leitura.nextInt();

        if (numero > 0){
            System.out.println("Número positivo!");
        } else {
            System.out.println("Número negativo!");
        }*/


        //****************************************************************************************************************
        //2 - Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
        /*Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro");
        int numero1 = leitura.nextInt();

        System.out.println("Digite o segundo número inteiro");
        int numero2 = leitura.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os números são iguais.");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior que o segundo número.");
        } else {
            System.out.println("O segundo número é maior que o primeiro número");
        }*/


        //****************************************************************************************************************
        //3 - Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        /*Scanner leitura = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado: ");
                double lado = leitura.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Area do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Difite o raio do círculo: ");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado!");
            } else {
                System.out.println("Escolha inválida!");
            }
            return;
        }*/

        //****************************************************************************************************************

        // 4 - Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        /*Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitura.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            
        }*/

        //****************************************************************************************************************
        //5 - Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
        /*Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }*/

        //****************************************************************************************************************
        //6 - Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número");
        int numero = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
            
        }







    }
}
