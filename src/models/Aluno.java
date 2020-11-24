package models;

public class Aluno{
	
	private int id;
	private String nome;
	private int idade;
	private String telefone;
	
	public Aluno(int id, String nome, int idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}
	public Aluno(){};
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return this.idade;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}