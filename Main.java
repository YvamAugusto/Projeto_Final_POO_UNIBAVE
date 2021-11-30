package Projeto_Final_POO;

import javax.swing.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

       Atacante atacante1 = new Atacante("Gabigol",9,1500000,
               LocalDate.of(2020,1,27), 4,0,11,
               6,31,9, 26,47);

       Atacante atacante2 = new Atacante("Bruno Henrique",27,1300000,
               LocalDate.of(2019,1,22), 3,1,7,
               6,34,11, 21,42);

       Atacante atacante3 = new Atacante("Vitinho",11,800000,
               LocalDate.of(2018,7,24), 0,0,0,
               0,0,0, 0,0);

       MeioCampista meioCampista1 = new MeioCampista("Everton Ribeiro",7,900000,
               LocalDate.of(2017,6,20), 0,0,7,
               29,87,11);

       MeioCampista meioCampista2 = new MeioCampista("Andreas Pereira",18,800000,
               LocalDate.of(2021,8,19), 0,0,4,
               18,62, 10);

       MeioCampista meioCampista3 = new MeioCampista("Arrascaeta",14,950000,
               LocalDate.of(2019,1,12), 1,0,2,
               23,73,15);

       Defensor defensor1 = new Defensor("Gustavo Henrique",2,790000,
               LocalDate.of(2019,12,18),2,2,8,
               2,17);

       Defensor defensor2 = new Defensor("Felipe Luís",16,830000,
               LocalDate.of(2019,7,23),3,0,5,
               2,24);

       Defensor defensor3 = new Defensor("David Luiz",23,1100000,
               LocalDate.of(2021,9,10),5,0,9,
               2,21);

       Defensor defensor4 = new Defensor("Matheuzinho",34,910000,
               LocalDate.of(2019,1,31),7,1,13,
               0,0);

       Goleiro goleiro1 = new Goleiro("Diego Alves",1,1100000,
               LocalDate.of(2017,7,30),0,0,0,
               0,0, 0);

       Atleta[] atletas = new Atleta[11];
       atletas[0] = atacante1;
       atletas[1] = atacante2;
       atletas[2] = atacante3;
       atletas[3] = meioCampista1;
       atletas[4] = meioCampista2;
       atletas[5] = meioCampista3;
       atletas[6] = defensor1;
       atletas[7] = defensor2;
       atletas[8] = defensor3;
       atletas[9] = defensor4;
       atletas[10] = goleiro1;

       GerenciadorPartidaImplementação gerenciador = new GerenciadorPartidaImplementação();

       gerenciador.iniciarPartida("Vasco da Gama", LocalDate.of(2021,11,30), atletas);


       for (int i = 0; i < atletas.length - 1; i++){
          for (int j = i + 1; j < atletas.length; j++){
             if (atletas[j].getNumeroJogador() == atletas[i].getNumeroJogador()){
                JOptionPane.showMessageDialog(null, "Há números de jogadores que se repetem!!");
             }
          }
       }

       JOptionPane.showMessageDialog(null, "Bola rolandooo!!");

       JOptionPane.showMessageDialog(null, "Fim do primeiro tempo!");

       JOptionPane.showMessageDialog(null, "Começa o segundo tempo!");

       JOptionPane.showMessageDialog(null, "Fim de jogo!");

       gerenciador.ImprimirEstatistica(atletas);
    }
}
