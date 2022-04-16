/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_13_database2;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
public class Ch13_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String url = "jdbc:derby://localhost:1527/testdb20220416";
        String user = "qwer";
        String password = "123456";
       try(Connection con = DriverManager.getConnection(url, user, password);
             Statement stm =   con.createStatement();){
          String sql = "SELECT * FROM student";
           ResultSet res = stm.executeQuery(sql);
           //index 由1開始
           while(res.next()){
            int id =    res.getInt(1);
            String name = res.getString("name");
            float  score =  res.getFloat(3);
            System.out.println(id+":"+name+":"+score);
           }
       } catch(SQLException ex){
           System.out.println(ex);
       }
    }
    
}
