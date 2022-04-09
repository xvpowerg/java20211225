/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20220409.Ch12_12_io6;

/**
 *
 * @author xvpow
 */
public class Ch12_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      try(TestClose1 tc1 = new TestClose1();
         TestClose2 tc2 = new TestClose2();){
          //tc2 = new TestClose2();
          System.out.println("Body...");
      }catch(Exception ex){
          System.out.println(ex);
      }
        System.out.println("===================================");  
        
        try(TestClose1 tc1 = new TestClose1(true);
         TestClose2 tc2 = new TestClose2();){
          //tc2 = new TestClose2();
          System.out.println("Body...");
      }catch(Exception ex){
          System.out.println(ex);
      }  
           System.out.println("===================================");  
            try(TestClose1 tc1 = new TestClose1(true);
                TestClose2 tc2 = new TestClose2(true);){
          //tc2 = new TestClose2();
          System.out.println("Body...");
          throw new Exception("main ex");
      }catch(Exception ex){
          Throwable[] thArray =   ex.getSuppressed();
          for (Throwable th : thArray){
              System.out.println(th+" ");
          }
          System.out.println(ex);
      }        
    }    
}
