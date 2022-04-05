package com.isidro.micro.services;

import java.util.List;

import com.isidro.micro.entities.Cliente;

public interface ClienteService {
	
	Cliente guardarCliente(Cliente cliente);

	List<Cliente> verTodosClientes();

	List<Cliente> buscarNombreApellidos(String nombre, String apellido);

	void borrarCliente(Cliente cliente);

	Cliente buscarPorId(Long id);

	Cliente crearCliente(Cliente cliente);

	Cliente actualizarCliente(Cliente cliente);
}
