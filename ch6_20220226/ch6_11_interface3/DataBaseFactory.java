/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20220226.ch6_11_interface3;

/**
 *
 * @author xvpow
 */
public class DataBaseFactory {
    public static  UserDao  createUserDao(int type){
        switch(type){            
            case 1:
                return new UserMSqlDao();
            default:    
            case 2:
                return new UserMySQLDao();
            case 3:
                return new UserOracleDao();            
        }
    }
}
