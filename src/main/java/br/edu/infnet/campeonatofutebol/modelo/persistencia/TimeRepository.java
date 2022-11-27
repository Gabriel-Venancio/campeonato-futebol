package br.edu.infnet.campeonatofutebol.modelo.persistencia;

import br.edu.infnet.campeonatofutebol.modelo.entidade.Time;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TimeRepository extends CrudRepository<Time, Long> {

    Time findByNome(String nome);

}
