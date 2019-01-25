/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author LENOVO
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
  Connection conn;
  
  public static Connection ConnecrDb()
{
    String url="jdbc:oracle:thin:@localhost:1521:XE";
      try
      {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn=DriverManager.getConnection(url,"library","library");
                return conn;
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
  }
}
