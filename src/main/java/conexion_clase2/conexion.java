package conexion_clase2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private static final String URL = "jdbc:mysql://localhost:3309/mibasededatos?allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public Connection getConnection(){
        Connection conexion = null;
            try{
        conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        System.out.println("Conexión establecida");
    } catch (SQLException e) {
        System.out.println("Error en la conexión");
        e.printStackTrace();
    }
            return conexion;
    }
}