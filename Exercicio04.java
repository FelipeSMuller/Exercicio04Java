package senaiprojetos;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Crie um array de inteiros com 6 elementos e encontre o valor mínimo no array.
		 * Imprima o valor mínimo.
		 */

		int[] numeros = new int[6];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Defina os elementos do array :"));
			System.out.println(numeros[i]);

		}

		for (int i = 1; i < numeros.length; i++) {
			int valorMinimo = numeros[0];

			if (numeros[i] < valorMinimo) {
				valorMinimo = numeros[i];
			}
			JOptionPane.showMessageDialog(null, "O menor valor do array é : " + valorMinimo);

		}

	}

}
