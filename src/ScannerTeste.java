import java.util.Scanner;
import java.util.Locale;

public class ScannerTeste {
    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

	System.out.println("Digite seu nome: ");
	String nome = scanner.next();

	System.out.println("Digite sua idade: ");
	int idade = scanner.nextInt();

	System.out.println("Digite sua altura: ");
	float altura = scanner.nextFloat();

	System.out.println("Olá, " + nome + " Seja bem-vindo(a).");
	System.out.println("Tem " + idade + " anos.");
	System.out.println("E tem " + altura + " metros de altura.");
    }
}
