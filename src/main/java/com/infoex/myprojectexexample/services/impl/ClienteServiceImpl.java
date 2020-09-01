package com.infoex.myprojectexexample.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infoex.myprojectexexample.model.Cliente;
import com.infoex.myprojectexexample.repository.ClienteRepository;
import com.infoex.myprojectexexample.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	private final ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Cliente> getAllCliente() {
		// TODO Auto-generated method stub
		return this.clienteRepository.findAll();
	}

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepository.save(cliente);
	}
	

}
