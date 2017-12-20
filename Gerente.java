package recuperacao;

public class Gerente implements Funcionario{
String nome;
int horáriodetrabalho;
int CPF ;
int anoInicionaempresa;


public Gerente(String nome, int horariodetrabalho, int CPF,int anoInicionaempresa ) {
	
	this.nome = nome;
	this.horáriodetrabalho = horariodetrabalho;
	this.CPF= CPF;
}
String getNome() {
	return nome;
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

int getanoInicionaempresa(int anoInicionaempresa) {
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
	return "Nome: " + nome + "CPF\n: CPF ";

	String funcionario;
	if (funcionario = "gerente" != null){
		return funcionario;
		}
	else if (funcionario ="engenheiro" != null){
		return funcionario;
		}
		else funcionario= "operadorMaquina"{
			return funcionario;
		}	
}
public boolean temInsalubridade() {
	return false;
}

}
