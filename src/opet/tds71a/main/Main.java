package opet.tds71a.main;

import java.util.ArrayList;

import javafx.collections.ArrayChangeListener;
import opet.tds171.contas.Conta;
import opet.tds171.contas.ContaCorrente;
import opet.tds171.contas.ContaPoupanca;

import opet.tds171a.utilitarios.Leitor;

public class Main {

	private static final int OPCAO_CADASTRAR = 1;
	private static final int OPCAO_LISTAR = 2;
	private static final int OPCAO_SAIR = 9;
	
	private static  ArrayList<Conta> arrayContas;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Conta> arrayContas = new ArrayList<Conta>();
		 
		arrayContas = new ArrayList<Conta>();
		int conta_acesso = -1;
		 
		popularContas();
		System.out.print("Menu!");
		System.out.print("1) Listar contas");
		
		int opcao_menu = 0;
		while(true) {
			listarContas();
			while(conta_acesso < 0) {
				conta_acesso = Leitor.readInt("Informe uma conta para acesso:");
				if(conta_acesso > arrayContas.size() ) {
					
				}
			}
			opcao_menu = Leitor.readInt("Digite uma opção do menu:");
			switch (opcao_menu) {
			case OPCAO_LISTAR:
				listarContas();
				break;
			case 9:
				
				break;
		
			}
		}
		 

	}
	
	/**
	 * Função para popular contas no sistema
	 */
	public static void popularContas()
	{
		Conta conta = null;
		// 
		for(int i=0; i<3;i++) {
			conta = new ContaCorrente((3*(i+150)), 1234+(3*(1+150)));	
			arrayContas.add(conta);
		}
		
		for(int i=0; i<3;i++) {
			conta = new ContaPoupanca((4*(i+123)), 1234+(4*(1+432)));	
			arrayContas.add(conta);
		}
		
	}
	
	public static void listarContas()
	{
		for (Conta conta : arrayContas) {
			String strTipoConta = "";
			if(conta instanceof ContaCorrente)
				strTipoConta = "Conta Corrente";
			else
				strTipoConta = "Poupança";
				
			System.out.println("Agência/Conta:"+conta.getAgencia()+"/"+conta.getNumero() + " - "+strTipoConta);
			
		}
	}

}
