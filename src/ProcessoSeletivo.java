import java.util.Scanner;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
	/*
	Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	System.out.println("Digite o salário desejado: ");
	double salario = scanner.nextDouble();

	analisarCandidato(salario);
	*/

	String[] candidatosFinais = selecaoCandidatos();

	System.out.println("CANDIDATOS SELECIONADOS:")
	for(int i = 0; i < candidatosFinais.length; i++) {
	    if(candidatosFinais[i] != "NULL")
		System.out.println(candidatosFinais[i]);
	}
    }

    static String[] selecaoCandidatos() {
	String[] candidatos = { "MIGUEL", "RAFAEL", "MINORU", "ZN", "EDUARDO", "THOMAZ", "DOMINIQUE", "KALIDIA", "DYEINE", "MATHEUS" };

	int candidatosSelecionados = 0;
	int candidatoAtual = 0;
	double salarioBase = 2000;
	String[] candidatosSelecionadosLista = { "NULL", "NULL", "NULL", "NULL", "NULL" };

	while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
	    String candidato = candidatos[candidatoAtual];
	    double salarioPretendido = valorPretendido();

	    System.out.println("O candidato " + candidato + " solicitou um salário de: R$" + salarioPretendido);

	    if(salarioPretendido <= salarioBase) {
		System.out.println("O candidato " + candidato + " foi selecionado");
		candidatosSelecionadosLista[candidatosSelecionados] = candidatos[candidatoAtual];
		candidatosSelecionados++;
	    }

	    candidatoAtual++;
	}

	return candidatosSelecionadosLista;
    }

    static double valorPretendido() {
	return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioDesejado) {
	double salarioBase = 2000;

	if(salarioDesejado < salarioBase )
	    System.out.println("LIGAR PARA O CANDIDATO");
	else if(salarioBase == salarioDesejado)
	    System.out.println("LIGAR PARA O CANDIDATO OFERECENDO CONTRA-PROPOSTA");
	else
	    System.out.println("AGUARDAR OS RESULTADOS DOS DEMAIS CANDIDATOS");
    }
}
