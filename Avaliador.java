package br.edu.ifs.academico;

public class Avaliador extends Pessoa {
	private int qtd_bancas;
	private String area_atuacao;

    public Avaliador(long cpf) {
        super(cpf);
    }
	
	@Override
	public String toString() {
		return super.toString() + "Avaliador [qtd_bancas=" + qtd_bancas + ", area_atuacao=" + area_atuacao + "]";
	}
	public int getQtd_bancas() {
		return qtd_bancas;
	}
	public void setQtd_bancas(int qtd_bancas) {
		this.qtd_bancas = qtd_bancas;
	}
	public String getArea_atuacao() {
		return area_atuacao;
	}
	public void setArea_atuacao(String area_atuacao) {
		this.area_atuacao = area_atuacao;
	}
}
