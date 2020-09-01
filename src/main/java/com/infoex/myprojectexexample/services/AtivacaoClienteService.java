package com.infoex.myprojectexexample.services;

import com.infoex.myprojectexexample.model.Cliente;
import com.infoex.myprojectexexample.notificacao.Notificador;

public class AtivacaoClienteService {

	private Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public void sendMsg(Cliente cliente, String msg) {
		this.notificador.notificar(cliente, msg);
	}
	
}
