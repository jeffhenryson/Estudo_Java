import java.util.Scanner;

public class teste8 {
    public static void main(String[] args) {

        // Crie um programa que solicite ao usuário digitar um número.
        // Utilize uma estrutura de controle para verificar se o número é par ou ímpar.
        // Imprima no console se o número é par ou ímpar.

        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero de 1 a 10: ");
        numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }
    }
}
