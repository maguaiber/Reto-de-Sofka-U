package Categorias;

import java.util.Random;
import javax.swing.JOptionPane;

public class Dificil {

    private String dificil1 = "Rubén Blades es un\n"
            + "1)Musico y Abogado\n"
            + "2)Activista y político\n"
            + "3)Actor\n"
            + "4)Todas las anteriores\n"
            + "5.Salir";

    private String dificil2 = "¿Cuántos colores tiene el espectro de luz visible?\n"
            + "1)7\n"
            + "2)4\n"
            + "3)5\n"
            + "4)3\n"
            + "5.Salir";

    private String dificil3 = "Cuáles son las lenguas romances?\n"
            + "1)Español, italiano, rumano, Frances, portugués\n"
            + "2)Frances, español, italiano, portugués\n"
            + "3)Rumano, latín, italiano\n"
            + "4)Español, italiano, portugués\n"
            + "5.Salir";

    private String dificil4 = "Como se escribe hija en inglés?\n"
            + "A)Son\n"
            + "B)Dougther\n"
            + "C)Daugther\n"
            + "D)Dooghter\n"
            + "5.Salir";

    private String dificil5 = "El imperio romano alcanzó su máxima expansión bajo el mando del emperador\n"
            + "A)Adriano\n"
            + "B)Domiciano\n"
            + "C)Caracala\n"
            + "D)Trajano\n"
            + "5.Salir";

    static Random random = new Random();

    public void Dificil() {

        String[] dificiles = new String[5];
        int[] respuestasdificiles = new int[5];

        int respuesta;
        int aleatorio;
        int score = 0;
        dificiles[0] = dificil1;
        dificiles[1] = dificil2;
        dificiles[2] = dificil3;
        dificiles[3] = dificil4;
        dificiles[4] = dificil5;

        respuestasdificiles[0] = 4;
        respuestasdificiles[1] = 1;
        respuestasdificiles[2] = 1;
        respuestasdificiles[3] = 3;
        respuestasdificiles[4] = 4;

        for (int i = 0; i < dificiles.length; i++) {

            aleatorio = random.nextInt(5);

            respuesta = Integer.parseInt(JOptionPane.showInputDialog(dificiles[aleatorio]));
            
            if (respuesta==5) {
                JOptionPane.showMessageDialog(null, "Por que te vas, miedo al exito?... en fin\n"
                        +"Tu Score fue de "+score);
            }

            if (respuesta == respuestasdificiles[aleatorio]) {
                JOptionPane.showMessageDialog(null, "No era tan dificil..Verdad?");
                score = score + 40;
                JOptionPane.showMessageDialog(null, "Nuevos puntos para Gryffindor" + "\n"
                        + "Score actual = " + score);
                
                if (score==200) {
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
