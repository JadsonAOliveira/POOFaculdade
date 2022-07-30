package br.edu.ifs.academico;

public class Pessoa {
    
    public Pessoa(long cpf){
        this.cpf = cpf;
    }
    private long cpf;
    private String nome;
    private char sexo;
    private String localNascimento;
    private String dataNascimento;

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo + ", localNascimento=" + localNascimento + ", dataNascimento=" + dataNascimento + '}';
    }

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getLocalNascimento() {
		return localNascimento;
	}

	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}   
}
