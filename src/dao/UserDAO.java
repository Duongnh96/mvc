/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.User;

/**
 * @description:
 * @author User
 * @create:Dec 4, 2017
 * @modifier:User
 * @modifined date :Dec 4, 2017
 * @exeption:
 */
  public class UserDAO {
  public static boolean add(User user) {
    Connection connection = null;
    try {
      connection = ConnectDB.connection();
      PreparedStatement ps = connection.prepareStatement(
          "INSERT INTO [dbo].[member] ([firstname],[lastname],[phone],[descation],[image],[gender],[vehicle],[option]) VALUES (?,?,?,?,?,?,?,?)");
      ps.setString(1, user.getFirstName());
      ps.setString(2, user.getLastName());
      ps.setString(3, user.getPhone());
      ps.setString(4, user.getDesCaption());
      ps.setString(5, user.getImage());
      ps.setString(6, user.getGender());
      ps.setString(7, user.getVehicle());
      ps.setString(8, user.getOption());
      return (ps.executeUpdate() > 0);
    } catch (Exception e) {
      return false;
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
  public static boolean update(User user, int id) {
    Connection connection = null;
    try {
      connection = ConnectDB.connection();
      PreparedStatement ps = connection.prepareStatement(
          "UPDATE [dbo].[member] SET [firstname]=?,[lastname]=?,[phone]=?,[descation]=?,[image]=?,[gender]=?,[vehicle]=?,[option]=? WHERE id=?");
      ps.setString(1, user.getFirstName());
      ps.setString(2, user.getLastName());
      ps.setString(3, user.getPhone());
      ps.setString(4, user.getDesCaption());
      ps.setString(5, user.getImage());
      ps.setString(6, user.getGender());
      ps.setString(7, user.getVehicle());
      ps.setString(8, user.getOption());
      ps.setInt(9, id);
      return (ps.executeUpdate() > 0);
    } catch (Exception e) {
      return false;
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
  public static boolean delete(int id) {
    Connection connection = null;
    try {
      connection = ConnectDB.connection();
      PreparedStatement ps = connection.prepareStatement("DELETE FROM [dbo].[member] WHERE id=?");
      ps.setInt(1, id);
      return (ps.executeUpdate() > 0);
    } catch (Exception e) {
      return false;
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }
  public static List<User> getList() {
    Connection connection = null;
    List<User> list = new ArrayList<>();
    try {
      connection = ConnectDB.connection();
      PreparedStatement ps = connection.prepareStatement("SELECT * FROM [dbo].[member]");
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        User u = new User();
        u.setId(rs.getInt(1));
        u.setFirstName(rs.getString(2));
        u.setLastName(rs.getString(3));
        u.setPhone(rs.getString(4));
        u.setDesCaption(rs.getString(5));
        u.setImage(rs.getString(6));
        u.setGender(rs.getString(7));
        u.setVehicle(rs.getString(8));
        u.setOption(rs.getString(9));
        list.add(u);
      }
    } catch (Exception e) {
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
    return list;
  }
  public static User getUserByID(int id) {
    Connection connection = null;
    User u=new User();
    try {
      connection = ConnectDB.connection();
      PreparedStatement ps = connection.prepareStatement("SELECT * FROM [dbo].[member] WHERE id=?");
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      while (rs.next()) {
        u.setId(rs.getInt(1));
        u.setFirstName(rs.getString(2));
        u.setLastName(rs.getString(3));
        u.setPhone(rs.getString(4));
        u.setDesCaption(rs.getString(5));
        u.setImage(rs.getString(6));
        u.setGender(rs.getString(7));
        u.setVehicle(rs.getString(8));
        u.setOption(rs.getString(9));
      }
    } catch (Exception e) {
    } finally {
      if (connection != null) {
        try {
          connection.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
    return u;
  }


}
