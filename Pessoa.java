package DesafioClasse;

public class Pessoa {
	String nome;
	Double peso;
	
	public Pessoa(String nome, Double peso){
		this.nome = nome;
		this.peso = peso;
	
	}
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	String apresentar() {
		return "Olá Eu sou o " + nome + " e tenho " + peso + "Kgs";
	}

}
