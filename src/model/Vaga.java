package model;

public class Vaga {
	
    private int id;
    private String descricao;
    private Endereco endereco;
    private float valor;
    private String beneficios;
    private String empresa;
    private String contato; 
    
    
	public Vaga(int id, String descricao, Endereco endereco, float valor, String beneficios, String empresa,
			String contato) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.endereco = endereco;
		this.valor = valor;
		this.beneficios = beneficios;
		this.empresa = empresa;
		this.contato = contato;
	}
	
	public Vaga() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getBeneficios() {
		return beneficios;
	}
	public void setBeneficios(String beneficios) {
		this.beneficios = beneficios;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
    
    
    
}
