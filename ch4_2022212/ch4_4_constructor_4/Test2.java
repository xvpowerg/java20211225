/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_2022212.ch4_4_constructor_4;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
        Test2(){
            this(20,30);
            System.out.println("Test2()");
        }
        Test2(int v1,int v2){            
            System.out.printf("Test2 v1%d,v2:%d %n",v1,v2);            
        }
        Test2(int v1,int v2,int v3){
            System.out.printf("Test2 v1%d,v2:%d,v3:%d %n",v1,v2,v3);            
        }
}
