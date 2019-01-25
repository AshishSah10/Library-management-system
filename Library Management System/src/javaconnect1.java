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
public class javaconnect1 {
  Connection conn;
  
  public static Connection ConnecrDb1()
  {
      try
      {
        Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\Library Management System\\LibraryNew.sqlite");
                return conn;
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
          return null;
      }
  }
}
