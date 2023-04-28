package conta.repository;

import conta.model.Conta;

public interface ContaRepository {

	
	//crud da conta (create, read, update, delete)
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void deletar(int numero);
	
	//Métodos Bancários Objetos das Classes ContaCorrente e ContaPoupanca
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem,int numeroDestino ,float valor);
	 
}
