package model;

import helper.Utils;

public class Produto {
	public static int contador = 1;
	
	public static int codigo;
	public static String nome;
	public static Double preco;
	
	public Produto(String nome, Double preco) {
		this.codigo = Produto.contador;
		this.nome = nome;
		this.preco = preco;
		Produto.contador += 1;
	}
	
	public int getcodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		Produto.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		Produto.preco = preco;
	}
	
	public  String toString() {
		return "Código: " + this.getcodigo() +
				"\nNome: " + this.getNome() +
				"\nPreço: " + Utils.doubleParaString(this.getPreco());
	}
	
	

}
