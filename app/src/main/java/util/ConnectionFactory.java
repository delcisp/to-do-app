package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//se algo nessa classe der errado tem que mudar os parametros do catch para exception ex
public class ConnectionFactory {
    
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/todoapp?characterEncoding=UTF-8";
    public static final String USER = "root";
    public static final String PASS = "12345";
  //jdbc:mysql://localhost:3306/?user=root
 //eu nao preciso criar um objeto da classe connectionfactory pra executar esse método (por ele ser static
  public static Connection getConnection() {
      try {
          Class.forName(DRIVER);
          return DriverManager.getConnection(URL, USER, PASS);
      } catch (ClassNotFoundException | SQLException ex) {
          throw new RuntimeException("NAO TA CONECTANDO COM O BANCO PORRA", ex);
      }
  }
    
  public static void closeConnection(Connection connection) {
      try {
          if (connection != null) {
              connection.close();
          }
      } catch (SQLException ex) {
        throw new RuntimeException("ERRO AO FECHAR A CONEXÃO COM O BANCO DE DADOS", ex);
      }
  }
  
    public static void closeConnection(Connection connection, PreparedStatement statement) {
      try {
          if (connection != null) {
              connection.close();
          }
          
          if(statement != null) {
              statement.close();
          }
          
      } catch (SQLException ex) {
        throw new RuntimeException("ERRO AO FECHAR A CONEXÃO COM O BANCO DE DADOS", ex);
      }
  }
    
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {
      try {
          if (connection != null) {
              connection.close();
          }
          
          if(statement != null) {
              statement.close();
          }
          
          if(resultSet != null) {
              resultSet.close();
          }
          
      } catch (SQLException ex) {
        throw new RuntimeException("ERRO AO FECHAR A CONEXÃO COM O BANCO DE DADOS", ex);
      }
  }
  
} 