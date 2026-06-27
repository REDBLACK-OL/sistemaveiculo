
package sistemaQR.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/sistemaQR";
    private static final String USUARIO = "root";
    private static final String CLAVE = "";

    public static Connection getConexion() {
        try {
            return DriverManager.getConnection(URL, USUARIO, CLAVE);
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}