
public class Main {

    public static void main(String[] args) {

        System.out.println("=== Iniciando Sistema de Estoque ===");

        try {
            retirarProduto(10, 15);
            System.out.println("Produto retirado com sucesso.");
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro de negócio: " + e.getMessage());
        } finally {
            System.out.println("Conexão com o banco encerrada.");
        }

        System.out.println("--------------------------------");

        try {
            dividir(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro matemático: " + e.getMessage());
        }

        System.out.println("--------------------------------");

        try {
            String nome = null;
            System.out.println(nome.length());
        } catch (NullPointerException e) {
            System.out.println("Erro: variável nula.");
        }

        System.out.println("--------------------------------");

        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: posição inválida no array.");
        }

        System.out.println("\n=== Programa finalizado ===");
    }

    // throws -> informa que o método pode lançar uma exceção
    static void dividir(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            // throw -> lança a exceção
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }

        System.out.println("Resultado: " + (a / b));
    }

    static void retirarProduto(int estoque, int quantidade) {
        if (quantidade > estoque) {
            throw new EstoqueInsuficienteException(
                    "Quantidade solicitada (" + quantidade +
                            ") é maior que o estoque (" + estoque + ").");
        }
    }
}