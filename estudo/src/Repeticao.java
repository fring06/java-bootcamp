public class Repeticao {
    public static void main(String[] args) {
	for (int i = 0; i <= 20; i++) {
	    System.out.println("index: " + i);
	}

	System.out.println("--------------------");

	String[] alunos = { "Gabriel", "Maria", "Amanda", "Jorge", "Miguel" };
	for (int i = 0; i < alunos.length; i++) {
	    System.out.println("Aluno no índice " + i + ": " + alunos[i]);
	}

	System.out.println("--------------------");

	for (int num = 1; num <= 10; num++){
	    if (num == 5)
		// break;
		continue;
	    System.out.println("Número: " + num);
	}

	System.out.println("--------------------");

	// while () {}
	// do while () {}
    }
}
