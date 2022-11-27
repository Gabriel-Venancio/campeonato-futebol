package br.edu.infnet.campeonatofutebol.modelo.entidade;

import javax.persistence.*;

@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "timeCasa")
    private Time timeCasa;

    @ManyToOne
    @JoinColumn(name = "timeVisitante")
    private Time timeVisitante;
    private Integer placarCasa;
    private Integer placarVisitante;

    public Partida(){
    }

    public Partida(Time timeCasa, Time timeVisitante, Integer placarCasa, Integer placarVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.placarCasa = placarCasa;
        this.placarVisitante = placarVisitante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public void setTimeCasa(Time timeCasa) {
        this.timeCasa = timeCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Integer getPlacarCasa() {
        return placarCasa;
    }

    public void setPlacarCasa(Integer placarCasa) {
        this.placarCasa = placarCasa;
    }

    public Integer getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(Integer placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    @Override
    public String toString() {
        return "Partida{" +
                ", timeCasa=" + timeCasa +
                ", timeVisitante=" + timeVisitante +
                ", placarCasa=" + placarCasa +
                ", placarVisitante=" + placarVisitante +
                '}';
    }
}
