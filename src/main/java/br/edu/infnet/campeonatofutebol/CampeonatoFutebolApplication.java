package br.edu.infnet.campeonatofutebol;

import br.edu.infnet.campeonatofutebol.enums.Posicao;
import br.edu.infnet.campeonatofutebol.modelo.entidade.Jogador;
import br.edu.infnet.campeonatofutebol.modelo.entidade.Partida;
import br.edu.infnet.campeonatofutebol.modelo.entidade.Time;
import br.edu.infnet.campeonatofutebol.modelo.persistencia.JogadorRepository;
import br.edu.infnet.campeonatofutebol.modelo.persistencia.PartidaRepository;
import br.edu.infnet.campeonatofutebol.modelo.persistencia.TimeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CampeonatoFutebolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CampeonatoFutebolApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(JogadorRepository jogadorRepository, TimeRepository timeRepository, PartidaRepository partidaRepository) {
		return(args) -> {

			//CRUD de Time

			//CRUD de Jogadores

			//CRUD de Partidas

			Time time = new Time("Brasil", 10, 0, 0);
			timeRepository.save(time);

			Posicao goleiro = Posicao.GOLEIRO;
			Posicao zagueiro = Posicao.ZAGUEIRO;
			Posicao lateral = Posicao.LATERAL;
			Posicao meioCampo = Posicao.MEIO_CAMPO;
			Posicao atacante = Posicao.ATACANTE;

			Time brasil = timeRepository.findByNome("brasil");
			Jogador jogador = new Jogador("Alisson", 28, goleiro, 1, brasil);
			jogadorRepository.save(jogador);


			Time timeArgentina = new Time("Argentina", 1, 5, 3);
			timeRepository.save(timeArgentina);

			Time argentina = timeRepository.findByNome("argentina");
			Jogador jogadorArgentina = new Jogador("Martines", 28, goleiro, 1, argentina);
			jogadorRepository.save(jogadorArgentina);


			Partida partida = new Partida(time, timeArgentina, 10, 0);
			partidaRepository.save(partida);
		};
	}
}
