package aula36;

import javax.swing.JOptionPane;

public class TesteAgenda {

	public static void main(String[] args) {

		String nomeAgenda;

		Agenda agenda = new Agenda();

		nomeAgenda = JOptionPane.showInputDialog("Nome da Agenda: ");
		agenda.setNome(nomeAgenda);

		String nome1, nome2, nome3;
		String tel1, tel2, tel3;
		String email1, email2, email3;

		// relacionamento tem-muitos contatos
		Contato cont1 = new Contato();
		nome1 = JOptionPane.showInputDialog("Contato 1" + "\nNome: ");
		cont1.setNome(nome1);
		tel1 = JOptionPane.showInputDialog("Contato 1" + "\nTelefone: ");
		cont1.setTelefone(tel1);
		email1 = JOptionPane.showInputDialog("Contato 1" + "\nEmail: ");
		cont1.setEmail(email1);

		Contato cont2 = new Contato();
		nome2 = JOptionPane.showInputDialog("Contato 2" + "\nNome: ");
		cont2.setNome(nome2);
		tel2 = JOptionPane.showInputDialog("Contato 2" + "\nTelefone: ");
		cont2.setTelefone(tel2);
		email2 = JOptionPane.showInputDialog("Contato 2" + "\nEmail: ");
		cont2.setEmail(email2);

		Contato cont3 = new Contato();
		nome3 = JOptionPane.showInputDialog("Contato 3" + "\nNome: ");
		cont3.setNome(nome3);
		tel3 = JOptionPane.showInputDialog("Contato 3" + "\nTelefone: ");
		cont3.setTelefone(tel3);
		email3 = JOptionPane.showInputDialog("Contato 3" + "\nEmail: ");
		cont3.setEmail(email3);

		Contato[] contatos = new Contato[3];
		contatos[0] = cont1;
		contatos[1] = cont2;
		contatos[2] = cont3;

		agenda.setContatos(contatos);

		// teste saída no console
		System.out.println(agenda.getNome());

		if (agenda != null && agenda.getContatos() != null) {
			for (Contato c : agenda.getContatos()) {
				System.out.println(
						"Nome: " + c.getNome() + " || Telefone: " + c.getTelefone() + " || Email: " + c.getEmail());
			}
		}
	}
}
