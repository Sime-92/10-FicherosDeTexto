import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuardarDatos {
    public static void main(String[] args) {
        String archivo = "datos.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            // Escribir los datos en el archivo
            bw.write(nombre + "," + edad);
            bw.newLine();

            System.out.println("Datos guardados exitosamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }
}

