package Projeto_Final_POO;

import java.time.LocalDate;

public class Atacante extends MeioCampista{

    private int numeroDeGols;
    private int numeroFinalisaçãoes;

    public Atacante(String nome, int numeroJogador, double salarioMensal, LocalDate dataAdmissao, int cartoesAmarelos,
                    int cartoesVermelho, int faltasCometidas, int numeroAssistencias, int numeroPasses,
                    int passesErrados, int numeroDeGols, int numeroFinalisaçãoes) {
        super(nome, numeroJogador, salarioMensal, dataAdmissao, cartoesAmarelos, cartoesVermelho, faltasCometidas,
                numeroAssistencias, numeroPasses, passesErrados);
        this.numeroDeGols = numeroDeGols;
        this.numeroFinalisaçãoes = numeroFinalisaçãoes;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento){
            case GOL_A_FAVOR: setNumeroDeGols(getNumeroDeGols()+1); setNumeroFinalisaçãoes(getNumeroFinalisaçãoes()+1);
                System.out.println("Goooooooooolllllll do Flamengoooo, "+getNome()+" é o nome deeeeeleeeeeeee!");
                break;
            case FINALIZACAO: setNumeroFinalisaçãoes(getNumeroFinalisaçãoes()+1);
                System.out.println("Praaaaa foraaaaaaa "+getNome()+", quaaseeeee!");
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public int getNumeroDeGols() {
        return numeroDeGols;
    }

    public void setNumeroDeGols(int numeroDeGols) {
        this.numeroDeGols = numeroDeGols;
    }

    public int getNumeroFinalisaçãoes() {
        return numeroFinalisaçãoes;
    }

    public void setNumeroFinalisaçãoes(int numeroFinalisaçãoes) {
        this.numeroFinalisaçãoes = numeroFinalisaçãoes;
    }
}
