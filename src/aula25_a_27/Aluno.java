package aula25_a_27;

import javax.swing.JOptionPane;

public class Aluno {

	String nome;
	String curso;
	public String disciplinas[] = new String[3];
	public double notas[] = new double[3];
	int matricula;

	void recebeDados() {
		nome = JOptionPane.showInputDialog("Nome do aluno: ");
		curso = JOptionPane.showInputDialog("Nome do curso: ");
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Nº de mátricula: "));
	}

	void atribuiNotas() {

		disciplinas[0] = "Banco de Dados";
		disciplinas[1] = "Estrutura de Dados";
		disciplinas[2] = "Engenharia de Software II";
		notas[0] = 7.6;
		notas[1] = 10.0;
		notas[2] = 3.9;
	}

	void mostraAluno() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Nome do curso: " + curso);
		System.out.println("Nº de matrícula: " + matricula);
	}

	void mostraNotas() {

		for (int i = 0; i < 3; i++) {
			if (notas[i] >= 7) {
				System.out.println("Aprovado em " + disciplinas[i] + ". \n Nota: " + notas[i]);
			} else {
				System.out.println("Reprovado em " + disciplinas[i] + ". \n Nota: " + notas[i]);
			}
		}
	}

}
