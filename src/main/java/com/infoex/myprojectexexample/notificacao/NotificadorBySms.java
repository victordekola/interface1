package com.infoex.myprojectexexample.notificacao;

import com.infoex.myprojectexexample.model.Cliente;

public class NotificadorBySms implements Notificador {

	@Override
	public void notificar(Cliente cliente, String Mensagem) {
		
		System.out.printf("Sms enviado para cliente, %s através do e-mail: %s com a seguinte mensagem: %s \n", 
				cliente.getNome(),
				cliente.getEmail(),
				Mensagem
				);
		
	}

}
