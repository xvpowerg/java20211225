/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_12_oo1;

public class Ch3_12 {

    public static void main(String[] args) {
        //希望限制年齡
        //6 250
        Student st1 = new Student();
        st1.name = "Ken";
        st1.age = 25;
        st1.height = 178.23f;
        st1.print();
        Student st2 = new Student();
        //Lindy  31  165.2
        st2.name = "Lindy";
        st2.age = 31;
        st2.height = 165.2f;
        st2.print();
       // System.out.println(st2.name+":"+st2.age+":"+st2.height);
        
    }
    
}
