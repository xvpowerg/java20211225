/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_4_lambda5;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item i1 = new Item("Item1");
        System.out.println(i1);
        
        TestIF4 itf4 = (String msg) ->{
                return new Item(msg);
        };
             System.out.println(itf4.testIF4("Item2"));
             
      TestIF4 itf4_2 = msg->new Item(msg);
      System.out.println(itf4_2.testIF4("Item3"));
      
      TestIF4 itf4_3 = Item::new;
       System.out.println(itf4_2.testIF4("Item4"));
   }
    
}
