/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_10_array7;

/**
 *
 * @author xvpow
 */
public class Ch2_10 {

    public static void main(String[] args) {
        int[][][] array  = new int[2][][];
        array[0] = new int[3][];
        array[0][2] = new int[]{5,6,7};        
        array[1] = new int[2][];        
        array[1][0] = new int[]{3,2};
        
        System.out.println(array[0][2][2]);
       //System.out.println(array[0][2][3]);
      // System.out.println(array[1][1][1]);
        
    }
    
}
