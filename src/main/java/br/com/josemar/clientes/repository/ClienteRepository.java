package br.com.josemar.clientes.repository;

import br.com.josemar.clientes.domain.controller.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    boolean existsByContaNumero(String numero);
}
