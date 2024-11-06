import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        @SuppressWarnings("unused")
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        int agencia = scanner.nextInt();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá, " + nome + "! Obrigado por criar uma conta em nosso banco.");
        System.out.println(
                "Sua agência é " + agencia + " e seu saldo é de R$ " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
