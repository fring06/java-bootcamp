import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Excecao {
    public static void main(String[] args) {
	try {
	    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

	    System.out.println("Digite seu nome:");
	    String nome = scanner.next();

	    System.out.println("Digite sua idade:");
	    int idade = scanner.nextInt();

	    System.out.println("Digite sua altura:");
	    float altura = scanner.nextFloat();

	    System.out.println("Olá, seu nome é: " + nome);
	    System.out.println("Você tem " + idade + " anos de idade.");
	    System.out.println("Sua altura é: " + altura + " metros.");

	    scanner.close();
	}
	catch(InputMismatchException e) {
	    System.err.println("[ERRO] - Os campos [IDADE] e [ALTURA] precisam ser numéricos!");
	}
    }
}
