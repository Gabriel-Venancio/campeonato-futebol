package br.edu.infnet.campeonatofutebol.modelo.persistencia;

import br.edu.infnet.campeonatofutebol.modelo.entidade.Partida;
import org.springframework.data.repository.CrudRepository;

public interface PartidaRepository extends CrudRepository<Partida, Long> {
}
