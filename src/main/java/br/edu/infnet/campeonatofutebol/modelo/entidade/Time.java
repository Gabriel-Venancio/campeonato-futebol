package br.edu.infnet.campeonatofutebol.modelo.entidade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany
    @JoinColumn(name = "time_id")
    private List<Jogador> jogadores;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    public Time(){
    }

    public Time(String nome, Integer vitorias, Integer derrotas, Integer empates) {
        this.nome = nome;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    @Override
    public String toString() {
        return "Time{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", vitorias=" + vitorias +
                ", derrotas=" + derrotas +
                ", empates=" + empates +
                '}';
    }
}