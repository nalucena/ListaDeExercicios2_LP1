import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        /* Dado um inteiro, X, imprima seus primeiros 10 múltiplos. Cada
        múltiplo X * i (onde 1 <= i <= 10) deve ser impresso em uma
        nova linha na forma: X x i = resultado.*/

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número que deseja exibir: ");

        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
