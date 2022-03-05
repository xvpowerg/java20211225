/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220305.Ch7_10_String;

/**
 *
 * @author xvpow
 */
public class Ch7_10 {

    /**
     * @param args the command line arguments
     */
    
    static void testString1(){
        String str = "ABC2DEF7GHIJ9";
        for (int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            if(c >= '0' && c <= '9'){
                continue;
            }
                System.out.println(str.charAt(i));    
        }
    }
     static void testString2(){
         String str = "5213479";
         System.out.println(str.substring(2));
          System.out.println(str.substring(2,6));
          System.out.println(str.substring(1,5));
          //2134
     }
    public static void main(String[] args) {
 
         //testString1();
         testString2();
    }
    
}
