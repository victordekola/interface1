package com.infoex.myprojectexexample.resources;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infoex.myprojectexexample.model.Cliente;
import com.infoex.myprojectexexample.notificacao.Notificador;
import com.infoex.myprojectexexample.notificacao.NotificadorBySms;
import com.infoex.myprojectexexample.services.AtivacaoClienteService;
import com.infoex.myprojectexexample.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	
	private final ClienteService clienteService;

	public ClienteResource(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	// this function has been build to get all client from db.
	@GetMapping
	public List<Cliente> getAllClienteIntoDb()
	{
		List<Cliente> cli = this.clienteService.getAllCliente();
		return cli;
	}
	//this function has been build to save into database and to send a msg via console to show a interface bysms or by email.
	@PostMapping
	public Cliente saveIntoDb(@RequestBody Cliente cliente)
	{
		this.clienteService.save(cliente);
		Notificador notificador = new NotificadorBySms();//calling a notificator interface to define bysms or email itself.
		AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
		ativacaoClienteService.sendMsg(cliente, "Acabamos de ativalo parabéns!!!");
		
		return cliente;
	}
	
}
