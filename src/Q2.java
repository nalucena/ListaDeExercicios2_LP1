import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        /* Desenvolver uma calculadora que o usuário será capaz de
        escolher uma das opções abaixo e passar 2 números para o
        processamento.
        i. Somar
        ii. Subtrair
        iii. Dividir // não permitir divisão por ZERO
        iv. Multiplicar
        v. Resto
        vi. Raiz
        vii. Potência */

        Scanner input = new Scanner(System.in);

        System.out.println("Para acessar a calculadora, por favor, escolha uma das opções abaixo: ");
        System.out.printf("1. Somar\n" +
                "2. Subtrair\n" +
                "3. Dividir \n" +
                "4. Multiplicar\n" +
                "5. Resto\n" +
                "6. Raiz\n" +
                "7. Potência \n");

        int operacaoEscolhida = input.nextInt();

        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();

        while (num2 == 0 && operacaoEscolhida == 3) {
            System.out.println("Número inválido, por favor, digite um número diferente de 0");
            System.out.println("Digite o segundo número novamente: ");
            num2 = input.nextDouble();
        }
        switch (operacaoEscolhida) {

            case 1:
                System.out.println("O valor da soma é de " + (num1 + num2));
                break;
            case 2:
                System.out.println("O valor da subtração é de " + (num1 - num2));
                break;
            case 3:
                if (num2 != 0) {
                    System.out.println("O valor da divisão é de " + (num1 / num2));
                } else {
                    System.out.println("Divisão por zero não permitida.");
                        }
                break;
            case 4:
                System.out.println("O valor da multiplicação é de " + (num1 * num2));
                break;
            case 5:
                System.out.println("O resto da divisão é de " + (num1 % num2));
                break;
            case 6:
                System.out.println("A raiz quadrada do primeiro número é de " + Math.sqrt(num1));
                break;
            case 7:
                System.out.println("O primeiro número elevado ao segundo número é de " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Operação inválida. Por favor, execute o programa novamente.");
                }
            }
        }

