package pe.edu.upeu.syscenterlife.modelo.repositorio;

import ch.qos.logback.core.net.server.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

@Repository
public interface ClienteRepository extends
        JpaRepository<Cliente, String> {

}
