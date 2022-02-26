/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_11_interface3;

/**
 *
 * @author xvpow
 */
public class UserOracleDao implements   UserDao{
public void create(){
      System.out.println("Oracle! Create");
  }
  public void query(){
      System.out.println("Oracle! Query");
  }
  public void  update(){
        System.out.println("Oracle! update");
  }
  public void   delete(){
         System.out.println("Oracle! delete");    
  }
}
