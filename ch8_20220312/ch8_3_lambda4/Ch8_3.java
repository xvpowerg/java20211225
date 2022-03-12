/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_3_lambda4;

/**
 *
 * @author xvpow
 */
public class Ch8_3 {
    static void runIF3(TestIF3 if3,String msg){
        int v = if3.test3(msg);
        System.out.println(" "+msg+" V:"+v);
    }
    
    static int testMethod(String msg){
        System.out.print("testMethod:"+msg);
        return msg.length();
    }
  
    public static void main(String[] args) {
                TestIF3 tif3_4 = String::length;
        runIF3(tif3_4,"tif3_4 ABCDE");
        
         TestIF3 tif3_5 = Ch8_3::testMethod;
         runIF3(tif3_5,"tif3_5 FG");
        
       TestIF3 tif3_1 = new TestIF3(){
           public int test3(String msg){
              System.out.print("內部類 MSG:"+msg);
              return msg.length();
           }       
       };
        runIF3(tif3_1,"tif3_1 InnerClass Hello!");
        TestIF3 tif3_2 = (String m)->{
           System.out.print("tif3_2 Msg:"+m);
           return m.length();
        };
        runIF3(tif3_2,"tif3_2 Hello!");
        
        TestIF3 tif3_3 = m->m.length();
        runIF3(tif3_3,"tif3_3 Hello!  ");
        

    }
    
}
