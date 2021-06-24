package aula28_a_33;

public class Aluno {

	private String nome;
	private String curso;
	private String disciplinas[] = new String[3];
	private double notas[] = new double[3];
	private int matricula;

	public Aluno(String nome, String curso, int matricula) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	void atribuiNotas() {
		disciplinas[0] = "Banco de Dados";
		disciplinas[1] = "Estrutura de Dados";
		disciplinas[2] = "Engenharia de Software II";
		notas[0] = 7.6;
		notas[1] = 10.0;
		notas[2] = 3.2;
	}

	void mostraAluno() {
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Nome do curso: " + curso);
		System.out.println("Nº de matrícula: " + matricula);
	}

	void mostraNotas() {
		for (int i = 0; i < 3; i++) {
			if (notas[i] >= 7) {
				System.out.println("Aprovado em " + disciplinas[i] + ". \nNota: " + notas[i]);
			} else {
				System.out.println("Reprovado em " + disciplinas[i] + ". \nNota: " + notas[i]);
			}
		}
	}
}
