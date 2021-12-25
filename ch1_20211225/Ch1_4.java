/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20211225;

/**
 *
 * @author xvpow
 */
public class Ch1_4 {

    public static void main(String[] args) {
        int count = 0;
        count = count + 2;
        System.out.println(count);
        count += 3;
        System.out.println(count);
        count += 2.5;//因為會將2.5轉為整數 所以不會出錯
        System.out.println(count);
        //count = count + 1.5f;
        
        
    }
    
}
