package br.com.challenge;

public class Function {
	private String res;
	private double dolar = 0.21;
	
	public String conversaoMoeda(double input, String moeda) {
		if(moeda == "Dólar para Real") {
			this.res = String.format("%.2f", input / this.dolar);
			return res;
		}
		else if(moeda == "Real para Dólar") {
			this.res = String.format("%.2f", input * this.dolar);
			return res;
		}
		return "Erro";
	}
	
	public String moedaSymbol(String moeda) {
		if(moeda == "Dólar para Real") {
			return "R$ ";
		}
		else if(moeda == "Real para Dólar") {
			return "US$ ";
		}
		return "Erro";
	}
	
	public String conversaoTemp(double input, String temp) {
		if(temp == "Celsius para Fahrenheit") {
			double valor = (input * 1.8) + 32;
			this.res = String.format("%.2f", valor);
			return res;
		}
		else if(temp == "Fahrenheit para Celsius") {
			double valor = (input - 32) / 1.8;
			this.res = String.format("%.2f", valor);
			return res;
		}
		return "Erro";
	}
	
	public String tempSymbol(String temp) {
		if(temp == "Celsius para Fahrenheit") {
			return " ºF";
		}
		else if(temp == "Fahrenheit para Celsius") {
			return " ºC";
		}
		return "Erro";
	}
}
