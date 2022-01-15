/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_14_oo3_construct;

/**
 *
 * @author xvpow
 */
public class Ch3_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setAge(18);
        st1.setName("Ken");
        st1.height = 178.25f;
        st1.print();
        
        Student st2 = new Student("Lucy",25,152.5f);
        st2.print();
        
        
        Student st3 = new Student();
        st3.print();
    }
    
}
