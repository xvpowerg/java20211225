/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20220108.ch2_11_function1;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {
    //函數必要條件如下:
    //回傳值 void 表示無回傳值
    //函數名稱
    //參數 ()表示無參數
    //函數本體
    static void test1(){
        System.out.println("Test1!!!");
    }
    static int test2(int v1,int v2){
        int ans = v1 * v2;
        //return 離開函數 或 回傳值        
        return ans;
    }
    
    //static 只能呼叫 static的
    public static void main(String[] args) {
        // TODO code application logic here
        test1();
        System.out.println(test2(2,5));
    }
    
}
