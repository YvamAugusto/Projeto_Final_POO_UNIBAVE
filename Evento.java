package Projeto_Final_POO;

public class Evento{

    private TipoEvento tipoEvento;
    private Atleta atletaEnvolvido;

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Atleta getAtletaEnvolvido() {
        return atletaEnvolvido;
    }

    public void setAtletaEnvolvido(Atleta atletaEnvolvido) {
        this.atletaEnvolvido = atletaEnvolvido;
    }
}
