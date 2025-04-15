public class ParOuImpar {
    // Método estático (pode ser chamado sem instanciar a classe)
    public static void verificar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é par.");
        } else {
            System.out.println(numero + " é ímpar.");
        }
    }
}