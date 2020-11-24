package model;


public class Curriculo {

    private int id;
    private String nome;
    private String dataNascimento;
    private String email;
    private String telefone;
    private Endereco endereco;
    private String linguagens;
    private String diferenciais;
    private String linkGit;
    private Experiencia experiencia;
    
    public Curriculo() {}
    
	public Curriculo(int id, String nome, String dataNascimento, String email, String telefone, Endereco endereco,
			String linguagens, String diferenciais, String linkGit, Experiencia experiencia) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.linguagens = linguagens;
		this.diferenciais = diferenciais;
		this.linkGit = linkGit;
		this.experiencia = experiencia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(String linguagens) {
		this.linguagens = linguagens;
	}
	public String getDiferenciais() {
		return diferenciais;
	}
	public void setDiferenciais(String diferenciais) {
		this.diferenciais = diferenciais;
	}
	public String getLinkGit() {
		return linkGit;
	}
	public void setLinkGit(String linkGit) {
		this.linkGit = linkGit;
	}
	public Experiencia getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(Experiencia experiencia) {
		this.experiencia = experiencia;
	}
    
            
    
}
