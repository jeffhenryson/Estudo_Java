import java.util.*;

public class if1 {

    public static void main(String[] args) {

        //Exercício Fácil:
        //Verificar se um número é positivo, negativo ou zero;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        // Verificar se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Fechar o scanner
        sc.close();

    }

}
