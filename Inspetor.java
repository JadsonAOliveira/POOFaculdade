package br.edu.ifs.academico;

public class Inspetor extends Pessoa {
	private String cidade;
	private int nivel;
	
	@Override
	public String toString() {
		return super.toString() + "Inspetor [cidade=" + cidade + ", nivel=" + nivel + "]";
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
