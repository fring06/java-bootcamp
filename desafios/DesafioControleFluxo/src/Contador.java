import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
	Scanner terminal = new Scanner(System.in);
	
	System.out.print("Digite o primeiro número: ");
	int num1 = terminal.nextInt();
	System.out.print("Digite o segundo número: ");
	int num2 = terminal.nextInt();

	try {
	    contar(num1, num2);
	} catch (ParametrosInvalidosException e){
	    System.out.println("O primeiro parâmetro não deve ser maior que o segundo!");
	}
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
	if(param1 > param2) {
	    throw new ParametrosInvalidosException();
	}

	int total = param2 - param1;
	for(int i = 1; i <= total; i++) {
	    System.out.println("[" + i + "]");
	}
    }
}
