import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

	limparTerminal();

        while (continuar) {
            System.out.println("");
            System.out.println("-----MENU-----");
	    System.out.println("DEPOSITAR [1]");
	    System.out.println("SACAR [2]");
	    System.out.println("CONSULTAR [3]");
	    System.out.println("ENCERRAR [0]");
	    System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
		    limparTerminal();

		    System.out.println("Digite o valor à depositar: ");
		    double deposito = scanner.nextDouble();

		    saldo += deposito;

		    System.out.println("Novo saldo: " + saldo);

                    break;

                case 2:
		    limparTerminal();

		    System.out.println("Digite o valor à sacar: ");
		    double saque = scanner.nextDouble();
		    if(saque > saldo) {
			System.out.println("[ERRO] Saldo Insuficiente!");
			break;
		    }

		    saldo -= saque;

		    System.out.println("Novo saldo: " + saldo);

                    break;
                case 3:
		    limparTerminal();

		    System.out.println("Saldo: " + saldo);

                    break;
                case 0:
		    limparTerminal();

                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
					//
                    break;
                default:
		    limparTerminal();

                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    static void limparTerminal() {
	System.out.print("\033[H\033[2J");
    }
}
