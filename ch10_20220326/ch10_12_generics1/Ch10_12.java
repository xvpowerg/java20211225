/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20220326.ch10_12_generics1;

/**
 *
 * @author xvpow
 */
public class Ch10_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     MyList<String> myLst = new MyList();
     myLst.add("A1");
     myLst.add("B2");
     myLst.add("C3");
     myLst.add("D4");
     myLst.foeach(v->System.out.println(v));
   
     MyList<Integer> myLst2 = new MyList();
     myLst2.add(10);
     myLst2.add(50);
     myLst2.add(70);
     myLst2.add(60);
     myLst2.foeach(v->System.out.println(v));
    }
    
}
