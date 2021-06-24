package aula28_a_33;

import javax.swing.JOptionPane;

import aula28_a_33.Conta;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta(11092, 80000, 100000, true);

		int opc = 0;

		while (opc != 9) {

			opc = Integer.parseInt(JOptionPane.showInputDialog("(1) Saque" + "\n(2) Depósito" + "\n(3) Saldo"
					+ "\n(4) Disp. Cheque Especial" + "\n(9) Finalizar"));

			switch (opc) {

			case 1:
				conta.realizaSaque(5500);
				break;

			case 2:
				conta.depositaDinheiro(2300);
				break;

			case 3:
				conta.consultaSaldo();
				break;

			case 4:
				conta.verificaEspecial();
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Consulta Encerrada.");
				break;

			default:
				JOptionPane.showMessageDialog(null, "Operação Inexistente!");

			}
		}
	}
}
