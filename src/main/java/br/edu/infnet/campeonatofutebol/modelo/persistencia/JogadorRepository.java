package br.edu.infnet.campeonatofutebol.modelo.persistencia;

import br.edu.infnet.campeonatofutebol.modelo.entidade.Jogador;
import org.springframework.data.repository.CrudRepository;

public interface JogadorRepository extends CrudRepository<Jogador, Long> {
}
