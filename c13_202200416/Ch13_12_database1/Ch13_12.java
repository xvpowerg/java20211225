/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_12_database1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch13_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String url = "jdbc:derby://localhost:1527/testdb20220416";
        String user = "qwer";
        String password = "123456";
       try(Connection con = DriverManager.getConnection(url, user, password);
             Statement stm =   con.createStatement();){
          String sql = 
                  String.format("INSERT INTO student(id,name,score) "
                          + "values(%d,'%s',%f)", new Random().nextInt(100000),"Ben",93.0);
          //int count = stm.executeUpdate("INSERT INTO student(id,name,score) values(1000,'Joy',18.5)");
          int count = stm.executeUpdate(sql);         
           System.out.println(count);
       } catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
