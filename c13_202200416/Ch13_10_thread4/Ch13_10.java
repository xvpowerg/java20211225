/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c13_202200416.Ch13_10_thread4;

/**
 *
 * @author xvpow
 */
public class Ch13_10 {

    static class TestLock{
        public synchronized void t1(TestLock lock){
            System.out.println("T1 TestLock");
            lock.t2();
        }
        public synchronized void t2(){
            System.out.println("T2 TestLock");
        }
    }
    
    public static void main(String[] args) {
       TestLock tlock1 = new TestLock();
       TestLock tlock2 = new TestLock();
        
       Thread t1  = new Thread(()->{
             tlock1.t1(tlock2);
       });
         Thread t2  = new Thread(()->{
             tlock2.t1(tlock1);
       });
         t1.start();
         t2.start();
    }
    
}
