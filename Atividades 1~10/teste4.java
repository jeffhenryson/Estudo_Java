public class teste4 {
    public static void main(String[] args) {

        // Declare duas variáveis do tipo String, fruta1 e fruta2, e atribua a elas os
        // valores "Maçã" e "maçã"
        // (diferenciando maiúsculas de minúsculas).
        // Verifique se fruta1 é igual a fruta2 (ignorando maiúsculas/minúsculas) e
        // imprima o resultado no console.

        String fruta1 = "Maçã";
        String fruta2 = "maçã";

        if (fruta1.equalsIgnoreCase(fruta2)) {
            System.out.println("As frutas são iguais.");
        } else {
            System.out.println("As frutas são diferentes.");
        }
    }
}
