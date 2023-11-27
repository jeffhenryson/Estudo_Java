import java.util.Scanner;

public class teste2 {

    public static void main(String[] args) {

        // Declare uma variável do tipo String chamada nome e atribua a ela o valor
        // "Maria".
        // Crie uma segunda variável do tipo String chamada sobrenome e atribua a ela o
        // valor "Silva".
        // Peça ao usuário para digitar um número inteiro e armazene o valor na variável
        // idade.
        // Imprima no console uma mensagem no formato "Olá, {nome} {sobrenome}! Você tem
        // {idade} anos."
        Scanner sc = new Scanner(System.in);
        String nome = "Maria";
        String sobrenome = "Silva";
        int idade = sc.nextInt();
        System.out.println("Olá, " + nome + " " + sobrenome + "! Você tem " + idade + " anos.");

    }
}
