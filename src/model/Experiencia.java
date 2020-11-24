package model;

public class Experiencia {

    private int id;
    private String nome;
    private String dataInicio;
    private String dataFim;
    private String atividades;
    
    public Experiencia() {}
    
	public Experiencia(int id, String nome, String dataInicio, String dataFim, String atividades) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.atividades = atividades;
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

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getAtividades() {
		return atividades;
	}

	public void setAtividades(String atividades) {
		this.atividades = atividades;
	}
    
    @Override
    public String toString() {
    	return super.toString();
    }
            
}
