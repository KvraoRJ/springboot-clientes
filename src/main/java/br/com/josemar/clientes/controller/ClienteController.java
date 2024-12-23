package br.com.josemar.clientes.controller;

import br.com.josemar.clientes.domain.controller.Cliente;
import br.com.josemar.clientes.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        var cliente = clienteService.findById(id);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping()
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        var novoCliente = clienteService.create(cliente);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(novoCliente.getId())
                .toUri();
        return ResponseEntity.created(location).body(novoCliente);
    }
}
