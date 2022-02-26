/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20220226.ch6_11_interface3;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class Ch6_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
      Path dp =   Paths.get("c:","mydir","dbinfo.txt");
     List<String> list =  Files.readAllLines(dp);
     String dbType = list.get(0).split(":")[1];
     int dbTypeInt = Integer.parseInt(dbType);
        UserDao userDao = DataBaseFactory.createUserDao(dbTypeInt);
        userDao.create();
        userDao.query();
        userDao.update();
        userDao.delete();
        
    }
    
}
