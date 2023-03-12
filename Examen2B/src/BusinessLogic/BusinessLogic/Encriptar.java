package BusinessLogic;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encriptar {

    public static String ejEncriptarMD5 (String ejpassword) {
        try {
            //Obtener instancia de MessageDigest para MD5
            MessageDigest ejMd = MessageDigest.getInstance("MD5");
            //Convertir la contraseña a un arreglo de bytes
            byte[] contrasenaBytes = ejpassword.getBytes();
            //Generar el hash en MD5 de la contraseña
            byte[] hash = ejMd.digest(contrasenaBytes);
            //Convertir el hash a una cadena hexadecimal
            StringBuilder ejsb = new StringBuilder();
            for (byte b : hash) {
                ejsb.append(String.format("%02x", b));
            }
            return ejsb.toString();
        } catch (NoSuchAlgorithmException e) {
            // Manejo de excepción si no se encuentra el algoritmo MD5
            e.printStackTrace();
            return null;
        }
    }
}