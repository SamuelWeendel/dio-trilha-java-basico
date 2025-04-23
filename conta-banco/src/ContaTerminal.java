import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) {

       // Solicitando os dados do usuário
       try (Scanner scanner = new Scanner(System.in)) {
           // Solicitando os dados do usuário
           System.out.print("Por favor, digite o número da conta: ");
           int numeroConta = scanner.nextInt();
           scanner.nextLine(); // Consumir o caractere de nova linha
           
           System.out.print("Por favor, digite o número da agência: ");
           String numeroAgencia = scanner.nextLine();
           
           System.out.print("Por favor, digite o nome do cliente: ");
           String nomeCliente = scanner.nextLine();
           
           System.out.print("Por favor, digite o saldo inicial: ");
           double saldo = scanner.nextDouble();
           
           // Exibindo a mensagem personalizada
           System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
       }    
            }
}
