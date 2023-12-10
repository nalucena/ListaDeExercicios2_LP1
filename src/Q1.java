import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        /*  Dado um inteiro, X, execute as seguintes ações condicionais
        a. Se X for ímpar, imprima Weird
        b. Se X for par e estiver no intervalo inclusivo de 2 a 5
           imprima Not Weird
        c. Se X for par e estiver no intervalo inclusivo de 6 a 20
           imprima Weird
        d. Se X for par e maior que 20, imprima Not Weird */

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro X: ");

        int num = input.nextInt();

        if (num % 2 != 0) {
            System.out.println("Weird");
        } else if (2 <= num && num <= 5) {
            System.out.println("Not Weird");
        } else if (6 <= num && num <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }



    }
}
