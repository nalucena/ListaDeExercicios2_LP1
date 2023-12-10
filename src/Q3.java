import java.util.Scanner;

public class Q3 {


    /* Receba X notas e calcule a média. (O usuário vai dizer a
       quantidade de valores que quer calcular)*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inofrme a quantidade de notas que serão utilizadas: ");
        int qtdNotas = input.nextInt();

        while (qtdNotas <= 0) {
            System.out.println("Por favor, insira um número válido de notas (pelo menos 1): ");
            qtdNotas = input.nextInt();
        }

        double somaNotas = 0;

        for (int i = 1; i <= qtdNotas; i++) {

            System.out.printf("Digite a nota %d: ", i);
            double nota = input.nextDouble();

            while (nota <0 || nota > 10) {
                System.out.println("Por favor, insira uma nota válida (entre 0 e 10): ");
                nota = input.nextDouble();
            }

            somaNotas += nota;

        }

        double media = somaNotas / qtdNotas;

        System.out.println("A média das notas é: " + media);

        input.close();

    }
}

