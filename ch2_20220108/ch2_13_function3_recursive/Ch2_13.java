/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_13_function3_recursive;

/**
 *
 * @author xvpow
 */
public class Ch2_13 {

    static void test1(int i){
        
        System.out.println("Start:"+i);
        if (i < 3){
          test1(i + 1);  
          System.out.println("in:"+i);
        }
      System.out.println("End:"+i);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //
        //1 2 3 4 5
        test1(1);
    }
    
}
