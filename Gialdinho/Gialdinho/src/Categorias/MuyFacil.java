package Categorias;

import java.util.Random;
import javax.swing.JOptionPane;

public class MuyFacil {

    private String muyfacil1 = "Cuales de estos animales tienen lana?\n"
            + "1)Oveja\n"
            + "2)Sapo\n"
            + "3)Tiburon\n"
            + "4)Ornitorrinco\n"
            + "5.Salir\n";
    private String muyfacil2 = "Cual de estas criaturas es un insecto?\n"
            + "1)Cucaracha\n"
            + "2)Raton\n"
            + "3)Delfín\n"
            + "4)Iguana\n"
            + "5.Salir\n";
    private String muyfacil3 = "Las rosas son\n"
            + "1)Galaxias\n"
            + "2)Acordiones\n"
            + "3)Flores\n"
            + "4)Lombrises\n"
            + "5.Salir\n";
    private String muyfacil4 = " Los ojos son\n"
            + "A) Ven\n"
            + "B)  Acarician\n"
            + "C) Hablan\n"
            + "D) Respiran\n"
            + "5.Salir\n";
    private String muyfacil5 = "¿Cuál es el opuesto de arriba?\n"
            + "1)Atras\n"
            + "2)Adelante\n"
            + "3)Derecha\n"
            + "4)Abajo\n"
            + "5.Salir\n";
    static Random random = new Random();

    public void MuyFacil() {

        String[] muyfaciles = new String[5];
        int[] respuestasmuyfaciles = new int[5];

        int respuesta;
        int aleatorio;
        int score = 0;
        muyfaciles[0] = muyfacil1;
        muyfaciles[1] = muyfacil2;
        muyfaciles[2] = muyfacil3;
        muyfaciles[3] = muyfacil4;
        muyfaciles[4] = muyfacil5;

        respuestasmuyfaciles[0] = 1;
        respuestasmuyfaciles[1] = 1;
        respuestasmuyfaciles[2] = 3;
        respuestasmuyfaciles[3] = 1;
        respuestasmuyfaciles[4] = 4;

        for (int i = 0; i < muyfaciles.length; i++) {

            aleatorio = random.nextInt(5);

            respuesta = Integer.parseInt(JOptionPane.showInputDialog(muyfaciles[aleatorio]));

            if (respuesta == 5) {
                JOptionPane.showMessageDialog(null, "Por que te vas, miedo al exito?... en fin\n"
                        + "Tu Score fue de " + score);
            }

            if (respuesta == respuestasmuyfaciles[aleatorio]) {
                JOptionPane.showMessageDialog(null, "No era tan dificil..Verdad?");
                score = score + 10;
                JOptionPane.showMessageDialog(null, "Nuevos puntos para Gryffindor" + "\n"
                        + "Score actual = " + score);

                if (score == 50) {
                    JOptionPane.showMessageDialog(null, "Congratulations, Has completado el jogo");
                    System.exit(0);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Perdistes, Sayonara Gil");
                System.exit(0);
            }

        }

    }

}
