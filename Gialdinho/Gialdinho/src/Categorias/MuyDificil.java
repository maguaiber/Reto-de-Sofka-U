/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Categorias;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Negro
 */
public class MuyDificil {

    private String muydificil1 = "¿Qué día asesinaron al Archiduque Francisco Fernando?\n"
            + "1)28 de junio\n"
            + "2)20 de agosto\n"
            + "3)14 de enero\n"
            + "4)27 de Julio\n"
            + "5.Salir\n";

    private String muydificil2 = "Jacob fue rey de unificador de Inglaterra y Escocia y fue hijo de la reina\n"
            + "1)Maria\n"
            + "2?Isabel\n"
            + "3)Antonieta\n"
            + "4)Victoria\n"
            + "5.Salir\n";

    private String muydificil3 = "¿Quién fue el hombre que le dio la respuesta de la inmortalidad a Gilgamesh?\n"
            + "1)Metatro\n"
            + "2)Virgilio\n"
            + "3)Noé\n"
            + "4)Nabucodonoso\n"
            + "5.Salir\n";

    private String muydificil4 = "Alejandro Magno era hijo de \n"
            + "1)Filipo\n"
            + "2)Filipo ll\n"
            + "3)Agamenón\n"
            + "4)Filipo lll\n"
            + "5.Salir\n";

    private String muydificil5 = "¿Cómo se escribe sombra en latín?\n"
            + "1)Ombra\n"
            + "2)Umbra\n"
            + "3)Ombre\n"
            + "4)Sombra\n"
            + "5.Salir\n";

    static Random random = new Random();

    public void MuyDificil() {

        String[] muydificiles = new String[5];
        int[] respuestasmuydificiles = new int[5];

        int respuesta;
        int aleatorio;
        int score = 0;
        muydificiles[0] = muydificil1;
        muydificiles[1] = muydificil2;
        muydificiles[2] = muydificil3;
        muydificiles[3] = muydificil4;
        muydificiles[4] = muydificil5;

        respuestasmuydificiles[0] = 1;
        respuestasmuydificiles[1] = 1;
        respuestasmuydificiles[2] = 3;
        respuestasmuydificiles[3] = 2;
        respuestasmuydificiles[4] = 2;

        for (int i = 0; i < muydificiles.length; i++) {

            aleatorio = random.nextInt(5);

            respuesta = Integer.parseInt(JOptionPane.showInputDialog(muydificiles[aleatorio]));

            if (respuesta == 5) {
                JOptionPane.showMessageDialog(null, "Por que te vas, miedo al exito?... en fin\n"
                        + "Tu Score fue de " + score);
            }

            if (respuesta == respuestasmuydificiles[aleatorio]) {
                JOptionPane.showMessageDialog(null, "No era tan dificil..Verdad?");
                score = score + 50;
                JOptionPane.showMessageDialog(null, "Nuevos puntos para Gryffindor" + "\n"
                        + "Score actual = " + score);

                if (score == 250) {
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
