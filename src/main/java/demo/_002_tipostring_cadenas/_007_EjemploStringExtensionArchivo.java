package demo._002_tipostring_cadenas;

public class _007_EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        
        String archivo = "alguna.imagen.pdf";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));
    }
}
