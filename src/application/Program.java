package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		aluno.nomeAluno = sc.nextLine();
		aluno.notaPrimTri = sc.nextDouble();
		aluno.notaSegTri = sc.nextDouble();
		aluno.notaTercTri = sc.nextDouble();
		
		aluno.calcularMedia();
		aluno.resultadoFinal();
		
		System.out.println(aluno);
		
		sc.close();
	}

}
