package br.com.challenge;

import javax.swing.JOptionPane;

public class Conversor {

	public static void main(String[] args) {

		Function f = new Function();
		
		while(true) {
			String opcoes = "";
			try {
				opcoes = (JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha")).toString();
			} catch(Exception e) {
				break;
			}
			
			if(opcoes == "Conversor de Moeda") {
				String moeda = (JOptionPane.showInputDialog(null, "Escolha uma opção ", "Câmbio", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Dólar para Real", "Real para Dólar"}, "Escolha")).toString();
				double input = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor: "));
				
				JOptionPane.showMessageDialog(null, "Valor convertido: "+f.moedaSymbol(moeda)+f.conversaoMoeda(input, moeda));	
				
				int resposta = 0;
				resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if(resposta == 0) {
						
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				}
			
			} else if(opcoes == "Conversor de Temperatura") {
				String temp = (JOptionPane.showInputDialog(null, "Escolha uma opção ", "Temperaturas", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Celsius para Fahrenheit", "Fahrenheit para Celsius"}, "Escolha")).toString();
				double input = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor: "));
				
				JOptionPane.showMessageDialog(null, "Temperatura convertida: "+f.conversaoTemp(input, temp)+f.tempSymbol(temp));	
				
				int resposta = 0;
				resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
				if(resposta == 0) {
						
				} else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
					break;
				}
			}
		}
	}		
}