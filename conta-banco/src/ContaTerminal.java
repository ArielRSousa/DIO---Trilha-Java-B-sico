import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por escolher o nosso banco, sua agência é " + agencia + " e sua conta é " + numeroConta + ". Seu saldo é de R$" + saldo + ".");
        scanner.close();
    }
}
