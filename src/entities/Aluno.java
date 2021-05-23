package entities;

public class Aluno {
	public String nomeAluno;
	public double notaPrimTri;
	public double notaSegTri;
	public double notaTercTri;
	public static double notaFinal;
	public static double pontosFaltantes;
	public static String resultadoFinal;
	
	public void calcularMedia() {
		notaFinal = (notaPrimTri + notaSegTri + notaTercTri);
	}
	
	public void resultadoFinal() {
		if (notaFinal >= 60.0) {
			this.resultadoFinal = "PASS";
		} else {
			this.resultadoFinal = "FAILED";
			pontosFaltantes = 60.0 - notaFinal;
		}
	}
	
	public String toString() {
		String mensagem;
		
		mensagem =	"FINAL GRADE = "
					+ String.format("%.2f", notaFinal)
					+ "\n"
					+ resultadoFinal;
		
		if (resultadoFinal == "FAILED") {
			mensagem +=	"\nMISSING "
						+ String.format("%.2f", pontosFaltantes)
						+ " POINTS";
		}
		
		return mensagem;
	}
}
