package recuperacao;

public class OperadorMaquinaa implements Funcionario {
	String nome;
	int hor�riodetrabalho;
	int CPF ;
	int anoInicionaempresa;
	
public OperadorMaquinaa(String nome, int horariodetrabalho, int CPF,int anoInicionaempresa ) {
		
		this.nome = nome;
		this.hor�riodetrabalho = horariodetrabalho;
		this.CPF= CPF;
	
	}
	String getNome() {
		return nome;
		}
	public void setNome(String nome){
	   this.nome=nome;
	}
	
	int getHorariodetrabalho() {
		return hor�riodetrabalho;
		}
	public void setHor�riodetrabalho(int hor�riodetrabalho){
	   this.hor�riodetrabalho=hor�riodetrabalho;
	}

	
	int getCPF() {
		return CPF;
		}
	public void setCPf(int CPF){
	   this.CPF=CPF;
	}
	public String getDados() {
		return "Nome: " + nome + "CPF\n: " + 
				CPF + "\nanoInicionaempresa: " + anoInicionaempresa+ "\nhorarioDeTranbalho " + hor�riodetrabalho;
	}
	String getanoInicionaempresa(String anoInicionaempresa) {
		return anoInicionaempresa;
		}
	public void anoInicionaempresa(int anoInicionaempresa){
	   this.anoInicionaempresa=anoInicionaempresa;
	}

	
	
	public String obterFuncionarios() {
		
		return null;
	}
	public boolean temInsalubridade() {
		
		return true;
	}
}