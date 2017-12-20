package recuperacao;

public class Engenheiro implements Funcionario {
	String nome;
	int horáriodetrabalho;
	int CPF ;
	int anoInicionaempresa;
	
	public Engenheiro(String nome, int horariodetrabalho, int CPF,int anoInicionaempresa ) {
		
		this.nome = nome;
		this.horáriodetrabalho = horariodetrabalho;
		this.CPF= CPF;
	
	}
	String getNome() {
		return nome;
		}
	public void setNome(String nome){
	   this.nome=nome;
	}
	
	int getHorariodetrabalho() {
		return horáriodetrabalho;
		}
	public void setHoráriodetrabalho(int horáriodetrabalho){
	   this.horáriodetrabalho=horáriodetrabalho;
	}

	
	int getCPF() {
		return CPF;
		}
	public void setCPf(int CPF){
	   this.CPF=CPF;
	}

	String getanoInicionaempresa(String anoInicionaempresa) {
		return anoInicionaempresa;
		}
	public void anoInicionaempresa(int anoInicionaempresa){
	   this.anoInicionaempresa=anoInicionaempresa;
	}
	public String getDados() {
		return "Nome: " + nome + "CPF\n: " + 
				CPF + "\nanoInicionaempresa: " + anoInicionaempresa+ "\nhorarioDeTranbalho " + horáriodetrabalho;
	}
	public String obterFuncionarios() {
		if (this.nome = null){
	  throw new Exception("O nome esta incorreto! Digite novamente");
	}}
	public boolean temInsalubridade() {
		return false;
	}
	
	}

