package Projeto_Final_POO;

import java.time.LocalDate;

public class Goleiro extends Defensor{

    private int numeroDefesas;

    public Goleiro(String nome, int numeroJogador, double salarioMensal, LocalDate dataAdmissao, int cartoesAmarelos,
                   int cartoesVermelho, int faltasCometidas, int partidasSemSofrerGols, int bolasRoubadas,
                   int numeroDefesas) {
        super(nome, numeroJogador, salarioMensal, dataAdmissao, cartoesAmarelos, cartoesVermelho, faltasCometidas,
                partidasSemSofrerGols, bolasRoubadas);
        this.numeroDefesas = numeroDefesas;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento) {
            case DEFESA:setNumeroDefesas(getNumeroDefesas() + 1);
                System.out.println(getNome() + " realizou uma defesa e que defesa meus amigos!!");
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public int getNumeroDefesas() {
        return numeroDefesas;
    }

    public void setNumeroDefesas(int numeroDefesas) {
        this.numeroDefesas = numeroDefesas;
    }
}
