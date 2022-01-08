/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_8_array5;

/**
 *
 * @author xvpow
 */
public class Ch2_8 {

    public static void main(String[] args) {
        //左右[]必須一樣
        int[][][] array1 = new int[2][3][2];
        int[] array2[][]  = new int[2][3][2];
        int array3[][][]  = new int[2][3][2];
        //2x3x2
        int[][][] array4 = {{{5,6},{7,8},{9,23}},  
                           {{41,56},{95,32},{77,66}}};
        //3x2
        int[][] array5 = new int[][]{{2,3},{5,9},{15,63}};
        
        int[][] array6 = new int[3][];
        //陣列屬於參考型別
        array6[0] = new int[3];
        array6[1] = new int[]{5,10};
        array6[2] = new int[5];
        
        //輸出10
        System.out.println(array6[1][1]);
        //array4 的7
      System.out.println(array4[0][1][0]);
       //array4 的77
        System.out.println(array4[1][2][0]);
    }
    
}
