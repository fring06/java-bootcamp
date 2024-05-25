import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
	// Inicializando o scanner
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

	// Input dos dados
	System.out.println("Digite o número da agência: ");
	int numeroAgencia = scanner.nextInt();

	System.out.println("Digite o nome da agência: ");
	String nomeAgencia = scanner.next();

	System.out.println("Digite o seu nome: ");
	String nomeCliente = scanner.next();

	System.out.println("Digite seu saldo: ");
	double saldo = scanner.nextDouble();

	// Mensagem final
	System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
