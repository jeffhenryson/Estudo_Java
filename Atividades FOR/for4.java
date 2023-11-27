public class for4 {

    public static void main(String[] args) {

        // Exercício Difícil com Loop For:
        // Desenvolva um programa que imprima os primeiros 15 números primos. Lembre-se
        // de que um
        // número primo é aquele que é divisível apenas por 1 e por ele mesmo. Utilize
        // um loop for
        // para atingir essa tarefa.

        int count = 0; 

        for (int numero = 2; count < 15; numero++) {
            if (ehPrimo(numero)) {
                System.out.println(numero);
                count++;
            }
        }
    }

    static boolean ehPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

}
