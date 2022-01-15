/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_2_func1_call_by_ref;

/**
 *
 * @author xvpow
 */
public class Ch3_2 {
    //call by reference
    static void swap(int[] array1){
        int tmp = array1[0];
        array1[0] = array1[1];
        array1[1] = tmp;
    }
    public static void main(String[] args) {
       int[] array1 = {5,9};
       System.out.println(array1[0]+":"+array1[1]);
       
//      int tmp = array1[0];
//      array1[0] = array1[1];
//      array1[1] = tmp;

      swap(array1);
      System.out.println(array1[0]+":"+ array1[1]);
      
    }
    
}
