/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220305.Ch7_9_lambda;

/**
 *
 * @author xvpow
 */
public class Ch7_9 {

static void testRun(MyRunnable myRun){
    myRun.run();
}
    public static void main(String[] args) {
    //顯示1~5            
    testRun(new MyRunnable(){
        public void run(){
            for (int i = 1;i<=5;i++){
                System.out.println(i);
            }
        }
    });
    
    System.out.println("=================================");
    testRun(()->{
        for(int i = 5; i>=1;i--){
            System.out.println(i);
        }    
    });
    
    }
    
}
