/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_11_interface3;

/**
 *
 * @author xvpow
 */
public class UserMySQLDao  implements UserDao{
  public void create(){
      System.out.println("MySQL! Create");
  }
  public void query(){
      System.out.println("MySQL! Query");
  }
  public void  update(){
        System.out.println("MySQL! update");
  }
  public void   delete(){
         System.out.println("MySQL! delete");    
  }
}
