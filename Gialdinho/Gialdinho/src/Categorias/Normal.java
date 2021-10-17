package Categorias;

import java.util.Random;
import javax.swing.JOptionPane;

public class Normal {

    private String normal1 = "La palabra *CAN* hace referencia a\n"
            + "1)Delfines\n"
            + "2)Tigre\n"
            + "3)Perros\n"
            + "4)Gatos\n"
            + "5.Salir\n";
    private String normal2 = "El océano está lleno de\n"
            + "1)Agua\n"
            + "2)Arboles\n"
            + "3)Viento\n"
            + "4)Nubes\n"
            + "5.Salir\n";
    private String normal3 = "¿En que continente está Italia?\n"
            + "1)Asia\n"
            + "2)Australia\n"
            + "3)América\n"
            + "4)Europa\n"
            + "5.Salir\n";
    private String normal4 = "Una palabra está compuesta por\n"
            + "1)Oraciones\n"
            + "2)Bloques\n"
            + "3)Letras\n"
            + "4)Números\n"
            + "5.Salir\n";
    private String normal5 = "Por un teléfono se puede\n"
            + "1)Viajar\n"
            + "2)Correr\n"
            + "3)Llamar\n"
            + "4)Acariciar\n"
            + "5.Salir\n";
    static Random random = new Random();

    public void normal() {

        String[] normales = new String[5];
        int[] respuestasnormales = new int[5];

        int respuesta;
        int aleatorio;
        int score = 0;
        normales[0] = normal1;
        normales[1] = normal2;
        normales[2] = normal3;
        normales[3] = normal4;
        normales[4] = normal5;

        respuestasnormales[0] = 3;
        respuestasnormales[1] = 1;
        respuestasnormales[2] = 4;
        respuestasnormales[3] = 3;
        respuestasnormales[4] = 3;

        for (int i = 0; i < normales.length; i++) {

            aleatorio = random.nextInt(5);

            respuesta = Integer.parseInt(JOptionPane.showInputDialog(normales[aleatorio]));

            if (respuesta == 5) {
                JOptionPane.showMessageDialog(null, "Por que te vas, miedo al exito?... en fin\n"
                        + "Tu Score fue de " + score);
            }

            if (respuesta == respuestasnormales[aleatorio]) {
                JOptionPane.showMessageDialog(null, "No era tan dificil..Verdad?");
                score = score + 30;
                JOptionPane.showMessageDialog(null, "Nuevos puntos para Gryffindor" + "\n"
                        + "Score actual = " + score);

                if (score == 150) {
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
