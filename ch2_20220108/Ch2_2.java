/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108;
import java.util.Random;
public class Ch2_2 {

    public static void main(String[] args) {
     
        // while 適合 不知道要傳遞多久狀況 如檔案 藍芽傳輸 網路傳輸
        int i = 1;
        while(i <= 5){
            System.out.print(i++ +" ");            
        }
        
        int size = 0;
        
        Random ran = new  Random();
        int data = 0;
        while( (data = ran.nextInt(50)) != 0   ){
            System.out.println(data);
        }
        
    }
    
}
