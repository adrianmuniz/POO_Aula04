package br.com.aula04.implementacao;

import br.com.aula04.beans.Cliente;
import br.com.aula04.beans.ContaCorrente;

public class ExecutarConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		
		cc.setAgencia(5050);
		cc.setConta(123456);
		cc.setSaldo(100.0f);
		
		Cliente cli = new Cliente("Cainã", "Rua do zero", "123.321.321", "10.1234-4", "99987-998");
		
		cc.setCliente(cli);
		
		System.out.println("ag:" + cc.getAgencia() + " conta:" + cc.getConta() + " saldo:" + cc.getSaldo());
		System.out.println("cpf: " + cc.getCliente().getCpf() + " nome:" + cc.getCliente().getNome());
		

	}

}
