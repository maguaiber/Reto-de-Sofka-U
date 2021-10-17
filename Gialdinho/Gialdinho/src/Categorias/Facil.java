package Categorias;

import java.util.Random;
import javax.swing.JOptionPane;

public class Facil {

    private String facil1 = "¿Cuántas extremidades tiene el cuerpo humano?\n"
            + "1)5\n"
            + "2)3\n"
            + "3)4\n"
            + "4)2\n"
            + "5.Salir\n";
    private String facil2 = "Francia es\n"
            + "1)Condado\n"
            + "2)Pais\n"
            + "3)Ducado\n"
            + "4)Animal\n"
            + "5.Salir\n";
    private String facil3 = "la luz\n"
            + "1)Ilumina\n"
            + "2)Anochese\n"
            + "3)Apaga\n"
            + "4)Oscurese\n"
            + "5.Salir\n";
    private String facil4 = "El tigre es\n"
            + "1)Un Animal\n"
            + "2)Un humano\n"
            + "3)Una casa\n"
            + "4)Un lugar\n"
            + "5.Salir\n";
    private String facil5 = "El agua\n"
            + "1)Moja\n"
            + "2)Seca\n"
            + "3)Resplandece\n"
            + "4)Quema\n"
            + "5.Salir\n";
    static Random random = new Random();

    public void Facil() {

        String[] faciles = new String[5];
        int[] respuestasfaciles = new int[5];

        int respuesta;
        int aleatorio;
        int score = 0;
        faciles[0] = facil1;
        faciles[1] = facil2;
        faciles[2] = facil3;
        faciles[3] = facil4;
        faciles[4] = facil5;

        respuestasfaciles[0] = 3;
        respuestasfaciles[1] = 2;
        respuestasfaciles[2] = 1;
        respuestasfaciles[3] = 1;
        respuestasfaciles[4] = 1;

        for (int i = 0; i < faciles.length; i++) {

            aleatorio = random.nextInt(5);

            respuesta = Integer.parseInt(JOptionPane.showInputDialog(faciles[aleatorio]));

            if (respuesta == 5) {
                JOptionPane.showMessageDialog(null, "Por que te vas, miedo al exito?... en fin\n"
                        + "Tu Score fue de " + score);
            }

            if (respuesta == respuestasfaciles[aleatorio]) {
                JOptionPane.showMessageDialog(null, "No era tan dificil..Verdad?");
                score = score + 20;
                JOptionPane.showMessageDialog(null, "Nuevos puntos para Gryffindor" + "\n"
                        + "Score actual = " + score);

                if (score == 100) {
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
