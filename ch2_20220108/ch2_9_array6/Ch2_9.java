/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_9_array6;

/**
 *
 * @author xvpow
 */
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //陣列預設值
        //基本型態
        //整數 0
        //小數 0.0
        //字元 空白字元 (0正好對到空白字元)
        //boolean false
        //非基本型態 一率為null
        
        float[] f1 = new float[2];
        System.out.println(f1[0]);        
        char[] c1 = new char[2];
        System.out.println(c1[0]);        
        boolean[] b1 = new boolean[2];
        System.out.println(b1[0]);     
        String[] s1 = new String[2];
        System.out.println(s1[0]);  
        System.out.println("==============================");
      int[][] array1 = new int[3][];
      
      array1[0] = new int[]{5,6,7,8};
      array1[2] = new int[]{11,18};
      
     // System.out.println(array1[2][2]);//java.lang.ArrayIndexOutOfBoundsException
      System.out.println(array1[1][2]);// java.lang.NullPointerException
    }
    
}
