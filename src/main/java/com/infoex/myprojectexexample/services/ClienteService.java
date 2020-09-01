package com.infoex.myprojectexexample.services;

import java.util.List;

import com.infoex.myprojectexexample.model.Cliente;

public interface ClienteService {

	List<Cliente> getAllCliente();
	void save(Cliente cliente);
}
