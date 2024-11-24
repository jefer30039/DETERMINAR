import java.awt.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    
    public static Font SFR;
    public static Font SFB;
    public static Font SFM;

    public static void main(String[] args) {

        // Carga las fuentes personalizadas
        SFR = FontLoader.loadFont("resources/SFR.OTF", 12);
        SFB = FontLoader.loadFont("resources/GB.OTF", 12);
        SFM = FontLoader.loadFont("resources/SFM.OTF", 12);
        try {
            // Establece el LookAndFeel nimbus
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        // Llama a la interfaz gráfica
        MainMenu interfaz = new MainMenu();
        interfaz.setVisible(true);
    }
}


