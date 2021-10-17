package gialdinho;

import Categorias.Dificil;
import Categorias.Facil;
import Categorias.MuyDificil;
import Categorias.MuyFacil;
import Categorias.Normal;
import javax.swing.JOptionPane;

public class Interfaz {

    public static MuyFacil muyFacil=new MuyFacil();
    public static Facil facil=new Facil();
    public static Normal normal = new Normal();
    public static Dificil dificil=new Dificil();
    public static MuyDificil muyDificil=new MuyDificil();
    public static int eleccion;

    public static Interfaz ejecutarJuego() {

        eleccion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Torneo Multiversal, ¿Ready to play?\n" + "1.Si\n" + "2.No"));
        switch (eleccion) {
            case 1:
                eleccion = Integer.parseInt(JOptionPane.showInputDialog("Please Select a Category to play\n"
                        + "1.MuyFacil\n"
                        + "2.Facil\n"
                        + "3.Normal\n"
                        + "4.Dificil\n"
                        + "5.MuyDificil\n"));
                
                switch (eleccion) {
                    case 1:
                        muyFacil.MuyFacil();
                        break;
                    case 2:
                        facil.Facil();
                        break;
                    case 3:
                        normal.normal();
                        break;
                    case 4:
                        dificil.Dificil();
                        break;
                    case 5:
                        muyDificil.MuyDificil();
                        break;
                        
                    default:
                        throw new AssertionError();
                }
                
            case 2:
                JOptionPane.showMessageDialog(null, "Eres una verguenza para tus ancestros");
                System.exit(0);

        }

        return Interfaz.ejecutarJuego();
    }

    
    }

