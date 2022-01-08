/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_7_array4;

/**
 *
 * @author xvpow
 */
public class Ch2_7 {

    public static void main(String[] args) {
     int[][] array2x3 = new int[2][3];
     array2x3[0][0] = 100;
     array2x3[0][2] = 170;
     array2x3[1][1] = 250;
     
     for (int i = 0 ; i < array2x3.length;i++){
         for (int k = 0; k < array2x3[i].length;k++){
             System.out.print(array2x3[i][k]+" ");                   
         }
         System.out.println();
     }
      System.out.println("======================");
     for (int[] array : array2x3){
         for (int v : array){
             System.out.print(v+" ");
         }
         System.out.println();
     }
     
    }
    
}
