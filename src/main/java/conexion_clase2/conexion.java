package conexion_clase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String USER = "user";
    private static final String PASSWORD = "password";

    public Connection getConnection(){
        Connection conexion = null;
            try{
        conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Conexión Ok");
    } catch (SQLException e) {
        System.out.println("Error en la conexión");
        e.printStackTrace();
    }
            return conexion;
    }
}