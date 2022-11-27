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
			Time timeBrasil = new Time("Brasil", 10, 0, 0);
			timeRepository.save(timeBrasil);

			Time timeArgentina = new Time("Argentina", 1, 5, 3);
			timeRepository.save(timeArgentina);

			Time timeEspanha = new Time("Espanha", 5, 2, 1);
			timeRepository.save(timeEspanha);

			Time timeAlemanha = new Time("Alemanha", 4, 2, 2);
			timeRepository.save(timeAlemanha);

			Time brasil = timeRepository.findByNome("brasil");

			Time argentina = timeRepository.findByNome("argentina");

			Time espanha = timeRepository.findByNome("espanha");

			Time alemanha = timeRepository.findByNome("alemanha");

			System.out.println(timeRepository.findAll());

			Time updateBrasil = timeRepository.findById(timeBrasil.getId()).get();
			updateBrasil.setVitorias(11);
			timeRepository.save(updateBrasil);

			timeRepository.delete(timeAlemanha);

			//CRUD de Jogadores
			Posicao goleiro = Posicao.GOLEIRO;
			Posicao zagueiro = Posicao.ZAGUEIRO;
			Posicao lateral = Posicao.LATERAL;
			Posicao meioCampo = Posicao.MEIO_CAMPO;
			Posicao atacante = Posicao.ATACANTE;

			Jogador jogadorBrasil1 = new Jogador("Alisson", 28, goleiro, 1, brasil);
			jogadorRepository.save(jogadorBrasil1);
			Jogador jogadorBrasil2 = new Jogador("Thiago Silva", 30, zagueiro, 2, brasil);
			jogadorRepository.save(jogadorBrasil2);
			Jogador jogadorBrasil3 = new Jogador("Danilo", 25, lateral, 3, brasil);
			jogadorRepository.save(jogadorBrasil3);
			Jogador jogadorBrasil4 = new Jogador("Paquetá", 24, meioCampo, 4, brasil);
			jogadorRepository.save(jogadorBrasil4);
			Jogador jogadorBrasil5 = new Jogador("Neymar", 27, atacante, 5, brasil);
			jogadorRepository.save(jogadorBrasil5);

			Jogador jogadorArgentina1 = new Jogador("Martines", 28, goleiro, 1, argentina);
			jogadorRepository.save(jogadorArgentina1);
			Jogador jogadorArgentina2 = new Jogador("Montiel", 24, zagueiro, 2, argentina);
			jogadorRepository.save(jogadorArgentina2);
			Jogador jogadorArgentina3 = new Jogador("Lisandro Martínez", 29, lateral, 3, argentina);
			jogadorRepository.save(jogadorArgentina3);
			Jogador jogadorArgentina4 = new Jogador("Enzo Fernández", 28, meioCampo, 4, argentina);
			jogadorRepository.save(jogadorArgentina4);
			Jogador jogadorArgentina5 = new Jogador("Messi", 30, atacante, 5, argentina);
			jogadorRepository.save(jogadorArgentina5);

			System.out.println(jogadorRepository.findAll());

			Jogador updateNeymar = jogadorRepository.findById(jogadorBrasil5.getId()).get();
			updateNeymar.setCamisa(10);
			jogadorRepository.save(updateNeymar);

			jogadorRepository.delete(jogadorArgentina5);

			//CRUD de Partidas
			Partida partida1 = new Partida(timeBrasil, timeArgentina, 10, 0);
			partidaRepository.save(partida1);

			Partida partida2 = new Partida(timeBrasil, timeEspanha, 5, 2);
			partidaRepository.save(partida2);

			System.out.println(partidaRepository.findAll());

			Partida updatePartida1 = partidaRepository.findById(partida1.getId()).get();
			updatePartida1.setPlacarCasa(6);
			partidaRepository.save(updatePartida1);

			partidaRepository.delete(partida2);
		};
	}
}
