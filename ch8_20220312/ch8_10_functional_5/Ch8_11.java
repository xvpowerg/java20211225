/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_10_functional_5;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch8_11 {

    static void printArras(Predicate<String> p,String... names){
        for(String n: names){
            if (p.test(n)){
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        printArras(s->s.length()> 3,"Vivin","Iris","Joy","Ben","Gigi");
        
    }
    
}
