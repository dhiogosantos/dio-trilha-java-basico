import java.util.Scanner;

/**
 * @author Dhiogo Santos
 * @version 1.0
 * @since 28/05/2024
 */

public class ContaTerminal {

    public static void main(String[] args) {

        int numero;
        String agencia, nomeCliente;
        float saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite seu saldo: R$ ");
        saldo = sc.nextFloat();

        System.out.println("\nOlá " + nomeCliente + ", "
                            + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", "
                            + "conta " + numero + " e seu saldo R$ " + saldo
                            + " já está disponível para saque.\n");
	sc.close();
    }
    
}
