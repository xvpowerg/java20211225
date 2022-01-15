/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20220115.ch3_15_oo4_inherit;

/**
 *
 * @author xvpow
 */
public class Ch3_15 {
    //建構式不會被繼承
    //私有的不會被繼承
    //看不見得不會被繼承
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Momo");
        dog1.setWeight(15);
        dog1.setAge(6);
        dog1.print();
      Dog dog2 = new Dog("LuLu",5,3);
      dog2.print();
      
      Dog dog3 = new Dog();
      dog3.print();
    }
    
}
