import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        
        //Exercício Médio:
        //Exercício: Calcular a média de notas;
        // Escreva um programa que solicita ao usuário que digite três notas. 
        // Em seguida, o programa deve calcular a média dessas notas. 
        // Se a média for maior ou igual a 7, o programa deve imprimir "Aprovado". 
        // Caso contrário, deve imprimir "Reprovado".

        Scanner sc = new Scanner(System.in);
        int nota1, nota2, soma;

        System.out.print("Vamos calcular a média das suas notas! Me diga sua primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Me diga a sua segunda nota: ");
        nota2 = sc.nextInt();

        soma = nota1 + nota2;
        double media = soma / 2;

        if (media >=7) {
            System.out.println("A média das suas notas é: " + media + (" Você passou!"));
        }else{
            System.out.println("A média das suas notas é: " + media + (" Você reprovou!"));
        }

        //System.out.println("A média das suas notas é: " + media);

    }
}
