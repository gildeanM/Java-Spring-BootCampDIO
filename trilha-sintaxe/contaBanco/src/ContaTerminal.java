
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args ){

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome!: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o nome da Agência !: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Agência !: ");
        numero = scanner.nextInt();

        System.out.print("Por favor, digite o saldo!: ");
        saldo = scanner.nextFloat();

        System.out.print("Olá "
                + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta "
                + numero +" e seu saldo "
                + saldo +" já está disponível para saque");







    }



}
