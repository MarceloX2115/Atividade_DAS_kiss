import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Chama o método estático da classe ParOuImpar
        ParOuImpar.verificar(numero);
        
        scanner.close();
    }
}