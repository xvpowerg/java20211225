/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_11_interface3;

/**
 *
 * @author xvpow
 */
public class UserMSqlDao implements UserDao{
     public void create(){
      System.out.println("MSQL! Create");
  }
  public void query(){
      System.out.println("MSQL! Query");
  }
  public void  update(){
        System.out.println("MSQL! update");
  }
  public void   delete(){
         System.out.println("MSQL! delete");    
  } 
}
