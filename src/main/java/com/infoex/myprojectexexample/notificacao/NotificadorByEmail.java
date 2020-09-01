package com.infoex.myprojectexexample.notificacao;

import com.infoex.myprojectexexample.model.Cliente;

public class NotificadorByEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String Mensagem) {
		// TODO Auto-generated method stub
		System.out.printf("Email enviado para cliente, %s através do e-mail: %s com a seguinte mensagem: %s \n",
				cliente.getNome(), cliente.getEmail(), Mensagem);
	}

}
