/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20220402.ch11_10_stream8;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch11_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList();
        list.add("ken");
        list.add("vivin");
        list.add("lucy");
        list.add("iris");
        //map 用來轉換
        Optional<String> op = list.stream().map(s->s.toUpperCase()).
                filter(s->s.startsWith("V")).findFirst();
        op.ifPresent(v->System.out.println(v));
                
        int lenSum = list.stream().mapToInt(s->s.length()).sum();
        System.out.println(lenSum);
        IntSummaryStatistics iss =   list.stream().mapToInt(s->s.length()).summaryStatistics();
        System.out.println(iss.getAverage());
        System.out.println(iss.getMax());
        System.out.println(iss.getMin());
    }
    
}
