/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int age = 25;
            //{}移除條件是在if內的命令只能一條
            if (age >= 18)
                System.out.println("成年");
            else
                System.out.println("未成年");
            
        String msg = age >= 18 ? "成年": "未成年";
        System.out.println(msg);
        
    }
    
}
