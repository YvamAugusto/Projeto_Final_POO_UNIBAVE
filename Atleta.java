package Projeto_Final_POO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Atleta extends Projeto_Final_POO.GerenciadorPartidaImplementação {

    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String nome;
    private int numeroJogador;
    private double salarioMensal;
    private LocalDate dataAdmissao;
    private int cartoesAmarelos;
    private int cartoesVermelho;
    private int faltasCometidas;

    public  Atleta(){}

    public Atleta(String nome, int numeroJogador, double salarioMensal, LocalDate dataAdmissao, int cartoesAmarelos,
                  int cartoesVermelho, int faltasCometidas) {
        this.nome = nome;
        this.numeroJogador = numeroJogador;
        this.salarioMensal = salarioMensal;
        this.dataAdmissao = dataAdmissao;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelho = cartoesVermelho;
        this.faltasCometidas = faltasCometidas;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento){
            case CARTAO_AMARELO: setCartoesAmarelos(getCartoesAmarelos()+1);
                System.out.println(getNome() + " recebeu um cartão amarelo!!");
                break;
            case CARTAP_VERMELHO: setCartoesVermelho(getCartoesVermelho()+1);
                System.out.println(getNome() + " recebeu um cartão vermelho!!");
                break;
            case FALTA_COMETIDA: setFaltasCometidas(getFaltasCometidas()+1);
                System.out.println(getNome() + " cometeu uma falta!!");
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroJogador() {
        return numeroJogador;
    }

    public void setNumeroJogador(int numeroJogador) {
        this.numeroJogador = numeroJogador;
    }

    public String getDataAdmissao() {
        return formatoData.format(dataAdmissao);
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public int getCartoesVermelho() {
        return cartoesVermelho;
    }

    public void setCartoesVermelho(int cartoesVermelho) {
        this.cartoesVermelho = cartoesVermelho;
    }

    public int getFaltasCometidas() {
        return faltasCometidas;
    }

    public void setFaltasCometidas(int faltasCometidas) {
        this.faltasCometidas = faltasCometidas;
    }
}