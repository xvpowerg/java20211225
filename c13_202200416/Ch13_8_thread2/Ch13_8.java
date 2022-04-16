/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_8_thread2;

/**
 *
 * @author xvpow
 */
public class Ch13_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName);
        Thread th1 = new Thread(()->{
               String name = Thread.currentThread().getName();
               System.out.println("RUN:"+name);
        },"MyThreadX");
        th1.start();
    }
    
}
