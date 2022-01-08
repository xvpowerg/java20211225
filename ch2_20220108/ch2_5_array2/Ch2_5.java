/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_5_array2;

/**
 *
 * @author xvpow
 */
public class Ch2_5 {
    
    public static void main(String[] args) {
        //陣列的宣告
        int[] array1 = new int[5];
        int array2[] = new int[3];
        //給初始值
        //{}只能用於宣告
        int[] array3 = {5,3,6,8,1};
        int[] array4 = new int[]{9,11,15,7,23};
        //錯誤不可填上長度
        //int[] array4 = new int[5]{9,11,15,7,23};
        
        //new int[] 用於已宣告的陣列 如想改變內容與長度時
        //因為{}只能用於宣告所以錯誤
        //array3 = {99,86};        
        array3 = new int[]{99,86};
        
    }
    
}
