/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_14_database3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 *
 * @author xvpow
 */
public class Ch13_14 {

    /**
     * @param args the command line arguments
     */
    //交易
    public static void main(String[] args) {
          String url = "jdbc:derby://localhost:1527/testdb20220416";
        String user = "qwer";
        String password = "123456";
       try(Connection con = DriverManager.getConnection(url, user, password);
             Statement stm =   con.createStatement();){
           con.setAutoCommit(false);
          String sql = 
                  String.format("INSERT INTO student(id,name,score) "
                          + "values(%d,'%s',%f)", new Random().nextInt(100000),"BenY",93.0);
          String sql2 = 
                  String.format("INSERT INTO student(id,name,score) "
                          + "values(%d,'%s',%f)", new Random().nextInt(100000),"BenX",93.0);
          //int count = stm.executeUpdate("INSERT INTO student(id,name,score) values(1000,'Joy',18.5)");
          int count = stm.executeUpdate(sql);         
           System.out.println(count);
           int count2 = stm.executeUpdate(sql2);         
           con.commit();
       } catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
