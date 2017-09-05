package opet.tds171.contas;

public class Conta {
	private int agencia = 0;
	private int numero = 0;
	private Double saldo = 0.0;
	
	
	Conta(int agencia, int numero) {
		this.setAgencia(agencia);
		this.setNumero(numero);
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
