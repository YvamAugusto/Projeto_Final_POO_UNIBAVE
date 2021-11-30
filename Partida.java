package Projeto_Final_POO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Partida {

    DateTimeFormatter formatoDataPartida = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nomeAdversario;
    private LocalDate dataPartida;
    private Atleta[] atletas = new Atleta[11];
    private Evento evento;

    public String getNomeAdversario() {
        return nomeAdversario;
    }

    public void setNomeAdversario(String nomeAdversario) {
        this.nomeAdversario = nomeAdversario;
    }

    public String getDataPartida() {
        return formatoDataPartida.format(dataPartida);
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public DateTimeFormatter getFormatoDataPartida() {
        return formatoDataPartida;
    }

    public void setFormatoDataPartida(DateTimeFormatter formatoDataPartida) {
        this.formatoDataPartida = formatoDataPartida;
    }

    public Atleta[] getAtletas() {
        return atletas;
    }

    public void setAtletas(Atleta[] atletas) {
        this.atletas = atletas;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

}
