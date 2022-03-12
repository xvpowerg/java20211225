/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_9_functional_4;

/**
 *
 * @author xvpow
 */
public class Ch8_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyList mlist = new MyList();
        mlist.add("ken");
        mlist.add("vivin");
        mlist.add("lindy");
        mlist.toUpCase(s->s.toUpperCase());
        mlist.foreach(v->System.out.println(v));
    }
    
}
