package br.com.josemar.clientes.service;

import br.com.josemar.clientes.domain.controller.Cliente;

public interface ClienteService {
    Cliente findById(Long id);

    Cliente create(Cliente cliente);
}
