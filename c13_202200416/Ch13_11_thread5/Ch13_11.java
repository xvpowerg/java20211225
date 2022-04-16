/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_11_thread5;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class Ch13_11 {

    public static void main(String[] args) {
      ExecutorService es =    Executors.newCachedThreadPool();
      for(int i = 1;i<=100;i++){
            es.submit(()->{
                  System.out.println(Thread.currentThread().getName());
            });  
    }
      es.shutdown();
        
    }
    
}
