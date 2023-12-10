import java.util.Scanner;

public class Q5 {

    // Dado um número encontre o seu fatorial.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número que deseja realizar a fatoração: ");
        int fatorial = 1;

        int numFatorial = input.nextInt();
        for (int i = numFatorial; i > 1; i--) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numFatorial + " é de: " + fatorial);
    }
}

