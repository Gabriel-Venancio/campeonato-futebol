package br.edu.infnet.campeonatofutebol.modelo.entidade;

import br.edu.infnet.campeonatofutebol.enums.Posicao;

import javax.persistence.*;

@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    private Integer posicao;
    private Integer camisa;

    @ManyToOne
    @JoinColumn(name="time_id", nullable=false)
    private Time time;

    public Jogador(){
    }

    public Jogador(String nome, Integer idade, Posicao posicao, Integer camisa, Time time) {
        this.nome = nome;
        this.idade = idade;
        setPosicao(posicao);
        this.camisa = camisa;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Posicao getPosicao() {
        return Posicao.valueOf(posicao);
    }

    public void setPosicao(Posicao posicao) {
        if(posicao != null) {
            this.posicao = posicao.getCode();
        }
    }

    public Integer getCamisa() {
        return camisa;
    }

    public void setCamisa(Integer camisa) {
        this.camisa = camisa;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", posicao=" + posicao +
                ", camisa=" + camisa +
                ", time=" + time +
                '}';
    }
}