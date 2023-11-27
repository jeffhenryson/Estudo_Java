public class teste7 {
    public static void main(String[] args) {
        // Declare um array de inteiros chamado numeros e inicialize-o com os valores:
        // 5, 10, 15, 20, 25.
        // Calcule a média dos números no array.
        // Imprima no console a mensagem "A média dos números é: {valor da média}".
        int[] numeros = { 10, 20, 30, 40, 50 };
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        double media = soma / numeros.length;
        System.out.println(media);
    }
}
