package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost/aulaweb";
    public Connection retornaConexao(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, "root", "pass");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Erro de Conexão: " + e.getMessage());
            return null;
        }
    }
}
