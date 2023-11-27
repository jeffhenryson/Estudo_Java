public class for3 {
    public static void main(String[] args) {

        // Exercício 3: Difícil
        // Crie um programa que imprima a sequência de Fibonacci até o 10º termo. A
        // sequência de
        // Fibonacci começa com 0 e 1, e cada termo subsequente é a soma dos dois
        // anteriores
        // (0, 1, 1, 2, 3, 5, 8, 13, 21, ...)
        
        int termo1 = 0, termo2 = 1;
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.print(termo1 + " ");
            int somadetermos = termo1 + termo2;
            termo1 = termo2;
            termo2 = somadetermos;
        }

    }
}
