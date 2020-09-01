package com.infoex.myprojectexexample.notificacao;

import com.infoex.myprojectexexample.model.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String Mensagem);
}
