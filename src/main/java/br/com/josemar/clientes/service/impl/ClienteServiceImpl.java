package br.com.josemar.clientes.service.impl;

import br.com.josemar.clientes.domain.controller.Cliente;
import br.com.josemar.clientes.repository.ClienteRepository;
import br.com.josemar.clientes.service.ClienteService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ClienteServiceImpl implements ClienteService {

    public final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Cliente create(Cliente novoCliente) {
        if (clienteRepository.existsByContaNumero(novoCliente.getConta().getNumero())) {
            throw new IllegalArgumentException("Essa conta jã existe");
        }
        return clienteRepository.save(novoCliente);
    }
}
