/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_12_function2_vargs;

/**
 *
 * @author xvpow
 */
public class Ch2_12 {


//    static int sum(int a,int b){
//        int ans = a + b;
//        return ans;
//    }
     static int sum(int[] data){
        int ans = 0;
        for (int v : data){
            ans += v;
        }
        return ans;
    }
     
     static int sum2(int... data){
         int ans = 0;
         for (int v : data){
             ans += v;
         }
         return ans;
     }
     
     static void test(String v1,int ... v2){
         System.out.print(v1+" ");
         for(int x : v2){
             System.out.print(x+" ");
         }
         System.out.println();
     }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] values = {2,5,7,8,9,10};
        int v = sum(values);
        System.out.println(v);
        
        int v2 = sum2(5,2,8,9);
        System.out.println(v2);
        v2 = sum2(values);
        System.out.println(v2);
        test("Ken",85,66,71,92);
        
    }
    
}
