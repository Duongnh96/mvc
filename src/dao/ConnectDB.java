/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @description:
 * @author User
 * @create:Dec 4, 2017
 * @modifier:User
 * @modifined date :Dec 4, 2017
 */
public class ConnectDB {
  public static Connection connection() {
    Connection connection = null;
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      connection = DriverManager
          .getConnection("jdbc:sqlserver://localhost:1433;databaseName=member;user=sa;password=123456");
    } catch (Exception e) {
    }
    return connection;
  }

}
