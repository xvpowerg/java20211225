/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_4_array1;
import java.util.Arrays;
/**
 *
 * @author xvpow
 */
public class Ch2_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] array1 = new int[10];
        array1[1] = 25;
        array1[3] = 77;
        array1[4] = 83;
        array1[7] = 36;
        for (int i = 0;i < array1.length;i++){
            System.out.println(array1[i]);
        }
        System.out.println("===============================");
//        for (int i = 0; i < array1.length;i++){
//            int v = array1[i];
//            System.out.print(v+" ");
//        }
        for (int v : array1){
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.println("=============================");
        //流行!!
        Arrays.stream(array1).forEach(System.out::println);
    }
    
}
