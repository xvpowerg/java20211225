/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20220305.Ch7_1_Interace_default1;

/**
 *
 * @author xvpow
 */
public class Ch7_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       MyList2 mylist2 = new MyList2();
        mylist2.add("A");
        mylist2.add("B");
        mylist2.add("C");
        mylist2.add("D"); 
        mylist2.foreach();
    }
    
}
