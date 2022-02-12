/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_2022212.ch4_11_string_1;

/**
 *
 * @author xvpow
 */
public class Ch4_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //字串沒有方法會改變自己
        String v1 = "A";        
        String v2 = "a";        
        System.out.println(v1.hashCode());               
        if (v1.equals(v2)){
           System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //忽略大小寫的比較
        if (v1.equalsIgnoreCase(v2)){
           System.out.println("Yes");
        }else{
            System.out.println("No");
        }
               
        
       String st2 = "abCdEf";
       System.out.println(st2.toUpperCase());
       System.out.println(st2.toLowerCase());
       
       for(int i =0 ; i < st2.length();i++){
            System.out.println(st2.charAt(i));
       }
       
       

    }
    
}
