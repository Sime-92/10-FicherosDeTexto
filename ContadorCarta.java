import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContadorCarta {
    public static void main(String[] args) {
        String archivo = "src/carta.txt";
        int caracteres = 0;
        int lineas = 0;
        int palabras = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                caracteres += linea.length();
                lineas++;

                String[] palabrasArray = linea.split("\\s+");
                palabras += palabrasArray.length;
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Caracteres: " + caracteres);
        System.out.println("Líneas: " + lineas);
        System.out.println("Palabras: " + palabras);
    }
}
