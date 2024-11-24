import java.awt.*;
import java.io.InputStream;

public class FontLoader {
    public static Font loadFont(String path, float size) {
        try {
            InputStream is = FontLoader.class.getResourceAsStream(path);
            Font font = Font.createFont(Font.TRUETYPE_FONT, is);
            return font.deriveFont(Font.PLAIN, size);
        } catch (Exception e) {
            e.printStackTrace();
            return new Font("SansSerif", Font.PLAIN, (int) size); // Fuente predeterminada en caso de error
        }
    }
}
