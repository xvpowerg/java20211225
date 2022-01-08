/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_6_array3;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch2_6 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        //java預設排序都是小到大 (遞增排序(ASC))
        int[] array1 = {18,1,13,6,9};
         Arrays.sort(array1);
         for (int v : array1){
             System.out.print(v+" ");
         }
         System.out.println();
         //使用binarySearch 一定要遞增排序
         int index = Arrays.binarySearch(array1, 13);
         System.out.println("index:"+index);
         //找不到
         //大於所有的 陣列長度  + 1 * -1
          index = Arrays.binarySearch(array1, 25);
          System.out.println(index); 
         //小於所有 回傳 -1
         index = Arrays.binarySearch(array1, 0); //答案是-1
            System.out.println(index); 
         //在中間 找下一個index + 1 * -1
         index = Arrays.binarySearch(array1, 5);
         System.out.println(index);
         index = Arrays.binarySearch(array1, 11);
           System.out.println(index);
    }
    
}
