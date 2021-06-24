package aula36;

import javax.swing.JOptionPane;

public class TesteCurso {

	public static void main(String[] args) {

		Curso curso = new Curso();
		curso.setNome("Orientação a Objetos");
		curso.setHorario(20);

		Professor professor = new Professor();
		professor.setNome("Leando Colevati");
		professor.setDepartamento("Departamento de T.I.");
		professor.setEmail("lecolevati@gmail.com");
		curso.setProfessor(professor);

		String nome1, nome2, nome3, nome4, nome5;
		int matricula1, matricula2, matricula3, matricula4, matricula5;
		double notas1[] = new double[4], notas2[] = new double[4], notas3[] = new double[4], notas4[] = new double[4],
				notas5[] = new double[4], somas = 0;

		Aluno aluno1 = new Aluno();
		nome1 = JOptionPane.showInputDialog("Aluno 1" + "\nNome: ");
		aluno1.setNome(nome1);
		matricula1 = Integer.parseInt(JOptionPane.showInputDialog("Aluno 1" + "\nMatrícula "));
		aluno1.setMatricula(matricula1);
		for (int i = 0; i < 4; i++) {
			notas1[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Aluno 1" + "\nInsira a " + (i + 1) + "ª nota do aluno"));
		}
		aluno1.setNotas(notas1);

		Aluno aluno2 = new Aluno();
		nome2 = JOptionPane.showInputDialog("Aluno 2" + "\nNome: ");
		aluno2.setNome(nome2);
		matricula2 = Integer.parseInt(JOptionPane.showInputDialog("Aluno 2" + "\nMatrícula "));
		aluno2.setMatricula(matricula2);
		for (int i = 0; i < 4; i++) {
			notas2[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Aluno 2" + "\nInsira a " + (i + 1) + "ª nota do aluno"));
		}
		aluno2.setNotas(notas2);

		Aluno aluno3 = new Aluno();
		nome3 = JOptionPane.showInputDialog("Aluno 3" + "\nNome: ");
		aluno3.setNome(nome3);
		matricula3 = Integer.parseInt(JOptionPane.showInputDialog("Aluno 3" + "\nMatrícula "));
		aluno3.setMatricula(matricula3);
		for (int i = 0; i < 4; i++) {
			notas3[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Aluno 3" + "\nInsira a " + (i + 1) + "ª nota do aluno"));
		}
		aluno3.setNotas(notas3);

		Aluno aluno4 = new Aluno();
		nome4 = JOptionPane.showInputDialog("Aluno 4" + "\nNome: ");
		aluno4.setNome(nome4);
		matricula4 = Integer.parseInt(JOptionPane.showInputDialog("Aluno 4" + "\nMatrícula "));
		aluno1.setMatricula(matricula4);
		for (int i = 0; i < 4; i++) {
			notas4[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Aluno 4" + "\nInsira a " + (i + 1) + "ª nota do aluno"));
		}
		aluno4.setNotas(notas4);

		Aluno aluno5 = new Aluno();
		nome5 = JOptionPane.showInputDialog("Aluno 5" + "\nNome: ");
		aluno5.setNome(nome5);
		matricula5 = Integer.parseInt(JOptionPane.showInputDialog("Aluno 5" + "\nMatrícula "));
		aluno5.setMatricula(matricula5);
		for (int i = 0; i < 4; i++) {
			notas5[i] = Double
					.parseDouble(JOptionPane.showInputDialog("Aluno 5" + "\nInsira a " + (i + 1) + "ª nota do aluno"));
		}
		aluno5.setNotas(notas5);

		Aluno[] alunos = new Aluno[5];
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		alunos[2] = aluno3;
		alunos[3] = aluno4;
		alunos[4] = aluno5;
		curso.setAlunos(alunos);

		// Teste saída no console
		System.out.println("Nome do Curso: " + curso.getNome());
		System.out.println("Horário: " + curso.getHorario() + "hrs");

		for (int i = 0; i < 4; i++) {
			somas += notas1[i];
		}
		if ((somas / 4) > 6) {
			System.out.println("\n " + nome1 + "\nAPROVADO" + "\nMédia Final: " + (somas / 4));
		} else {
			System.out.println("\n " + nome1 + "\nREPROVADO" + "\nMédia Final: " + (somas / 4));
		}

		somas = 0;
		for (int i = 0; i < 4; i++) {
			somas += notas2[i];
		}
		if ((somas / 4) > 6) {
			System.out.println("\n " + nome2 + "\nAPROVADO" + "\nMédia Final: " + (somas / 4));
		} else {
			System.out.println("\n " + nome2 + "\nREPROVADO" + "\nMédia Final: " + (somas / 4));
		}

		somas = 0;
		for (int i = 0; i < 4; i++) {
			somas += notas3[i];
		}
		if ((somas / 4) > 6) {
			System.out.println("\n " + nome3 + "\nAPROVADO" + "\nMédia Final: " + (somas / 4));
		} else {
			System.out.println("\n " + nome3 + "\nREPROVADO" + "\nMédia Final: " + (somas / 4));
		}

		somas = 0;
		for (int i = 0; i < 4; i++) {
			somas += notas4[i];
		}
		if ((somas / 4) > 6) {
			System.out.println("\n " + nome4 + "\nAPROVADO" + "\nMédia Final: " + (somas / 4));
		} else {
			System.out.println("\n " + nome4 + "\nREPROVADO" + "\nMédia Final: " + (somas / 4));
		}

		somas = 0;
		for (int i = 0; i < 4; i++) {
			somas += notas5[i];
		}
		if ((somas / 4) > 6) {
			System.out.println("\n " + nome5 + "\nAPROVADO" + "\nMédia Final: " + (somas / 4));
		} else {
			System.out.println("\n " + nome5 + "\nREPROVADO" + "\nMédia Final: " + (somas / 4));
		}

	}
}
