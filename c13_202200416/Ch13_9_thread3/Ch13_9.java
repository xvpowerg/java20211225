/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_9_thread3;

/**
 *
 * @author xvpow
 */
public class Ch13_9 {
     
    private static class Test{
        private int x = 0;
        
        public void loop(){
            
            
            for (int i =1;i<=10;i++){
                
                    synchronized(this){
                        System.out.println("S:"+Thread.currentThread().getName());
                        x++;
                        System.out.println(x);
                      System.out.println("E:"+Thread.currentThread().getName());
                    }               
            }             
            
        }
        
    }
    
    public static void main(String[] args) {
       
        Test t1 = new Test();
        Thread th1 = new Thread(()->{         
          t1.loop();
        });
           Thread th2 = new Thread(()->{            
              t1.loop();
        });
    
        th1.start();
        th2.start();
        
    }
    
}
