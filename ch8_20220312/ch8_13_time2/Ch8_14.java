/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20220312.ch8_13_time2;
import java.time.LocalDate;
/**
 *
 * @author xvpow
 */
public class Ch8_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(LocalDate.now());
        LocalDate data1 = LocalDate.of(2022, 2, 25);
        System.out.println(data1);
        LocalDate data2 = data1.plusDays(6);
        System.out.println(data2);
        System.out.println(data1.isAfter(data2));
        System.out.println(data1.isBefore(data2));
    }
    
}
